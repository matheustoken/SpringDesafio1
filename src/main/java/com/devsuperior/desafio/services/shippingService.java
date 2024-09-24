package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class shippingService {
    public double shipping(Order Order) {
        if (Order.getBasic()< 100.0) {
            return 20.0;
        } else if (Order.getBasic() < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }



}
