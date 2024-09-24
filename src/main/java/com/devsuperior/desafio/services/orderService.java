package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderService {

   @Autowired
   shippingService ShipppingService;


    public double total(Order order){
        return (order.getBasic()*(1- (order.getDiscount()/100))+
            ShipppingService.shipping(order));

    }


}
