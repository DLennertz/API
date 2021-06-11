package com.residencia.dell.controllers;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//import com.residencia.dell.Exception.CustomException;
import com.residencia.dell.entities.Orderlines;
import com.residencia.dell.entities.Orders;
import com.residencia.dell.services.OrderlinesService;
import com.residencia.dell.services.OrdersService;
import com.residencia.dell.vo.NotaFiscalVO;
import com.residencia.dell.vo.OrdersVO;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private OrderlinesService orderlinesService;

    @GetMapping("/{id}")
    public ResponseEntity<Orders> findById(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(ordersService.findById(id),headers, HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity<List<Orders>> findAll() throws Exception{
//
//        HttpHeaders headers = new HttpHeaders();
//        return new ResponseEntity<>(ordersService.findAll(),headers,HttpStatus.OK);
//    }

    //COM PAGINACAO
    @GetMapping
    public ResponseEntity<List<Orders>> findAll(@RequestParam (required = false)Integer pagina,
                                                @RequestParam(required = false)Integer qtdRegistros)
            throws Exception{
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(ordersService.findAll(pagina,qtdRegistros),headers,HttpStatus.OK);
    }

    //COM VO
    @GetMapping("/listar-todos")
    public ResponseEntity<List<OrdersVO>> findAllVO(
            @RequestParam(required = false) Integer pagina,
            @RequestParam(required = false) Integer qtdRegistros)
            throws Exception {

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(ordersService.findAllVO(pagina,
                qtdRegistros), headers, HttpStatus.OK);
    }

    @GetMapping("/count")
    public Long count() {
        return ordersService.count();
    }


    @PostMapping("/save")
    public ResponseEntity<Orders> save(@RequestBody Orders orders){
        HttpHeaders headers = new HttpHeaders();

        if(null != ordersService.save(orders))
            return new ResponseEntity<Orders>(ordersService.save(orders), headers, HttpStatus.OK);
        else
            return new ResponseEntity<Orders>(ordersService.save(orders), headers, HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Orders update(@Valid @RequestBody Orders orders){
/*
    	if(orders.getOrderId()==null) {
    		throw new CustomException("id do pedido nulo","400");
    	}
        
        if(orders.getCustomers()==null) {
        	throw new CustomException("id do cliente nulo","400");
        }
        BigDecimal b0 = new BigDecimal(0);
        BigDecimal b1 = orders.getTotalAmount();
        if(b1.compareTo(b0)<0) {
        	throw new CustomException("total amount menor que zero","400");
        }
      
   */
        return ordersService.update(orders);
    	
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Orders> delete(@RequestParam Integer id){
        HttpHeaders headers = new HttpHeaders();
        boolean isRemoved = ordersService.delete(id);
        if (isRemoved){
            return new ResponseEntity<>(headers,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(headers,HttpStatus.BAD_REQUEST);

        }

    }

    @GetMapping("/nf/{id}")
    public ResponseEntity<NotaFiscalVO> NFfindById(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(ordersService.NFfindById(id),headers,HttpStatus.OK);
    }




//IAN********
//    @PostMapping("/saveVO")
//    public ResponseEntity<Orders> saveVO(@RequestBody OrdersVO ordersVO) {
//        HttpHeaders headers = new HttpHeaders();
//        Orders newOrder = ordersService.saveVO(ordersVO);
//
//        if (null != newOrder)
//            return new ResponseEntity<>(newOrder, headers, HttpStatus.OK);
//        else
//            return new ResponseEntity<>(newOrder, headers, HttpStatus.BAD_REQUEST);
//    }


//    NOSSOOOOOOOOOOOO!!!!!!!!!!!!!!!!!!!!!!!!
    @PostMapping ("/saveVO")
    public Orders saveVO(@Valid @RequestBody OrdersVO ordersVO){
        HttpHeaders headers = new HttpHeaders();

        OrdersVO savedOrder = ordersService.saveVO(ordersVO);
        Integer id = savedOrder.getOrderId();
        for (Orderlines odl: ordersService.findById(id).getListOrdersLines()){
            odl.setOrdersId(ordersService.findById(id));
             orderlinesService.save(odl);
        }
        return ordersService.findById(id);
    }
}
