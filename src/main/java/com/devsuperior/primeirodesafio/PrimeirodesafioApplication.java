package com.devsuperior.primeirodesafio;

import com.devsuperior.primeirodesafio.entities.Order;
import com.devsuperior.primeirodesafio.services.OrderService;
import com.devsuperior.primeirodesafio.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.Locale;

@SpringBootApplication
public class PrimeirodesafioApplication implements CommandLineRunner {
//	@Autowired
//	private ShippingService shippingService;

	@Autowired
	private OrderService orderService;


	public static void main(String[] args) {
		SpringApplication.run(PrimeirodesafioApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Order order = new Order();

		order.setCode(sc.nextInt());
		order.setBasic(sc.nextDouble());
		order.setDiscount(sc.nextDouble());

		double total = orderService.total(order);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + total);

		sc.close();
	}

}
