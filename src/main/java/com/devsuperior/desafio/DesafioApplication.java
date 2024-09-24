package com.devsuperior.desafio;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.orderService;
import com.devsuperior.desafio.services.shippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private orderService OrderService;

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o código do pedido:");
        Integer code = sc.nextInt();

        System.out.print("Qual é o valor básico:");
        Double basic = sc.nextDouble();

        System.out.print("Qual é o valor do desconto:");
        Double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);


        double totalValue = OrderService.total(order);


        // Exibindo o resultado
        System.out.printf("Pedido código %d, valor total: R$ %.2f%n", order.getCode(), totalValue);

        sc.close();

    }

}
