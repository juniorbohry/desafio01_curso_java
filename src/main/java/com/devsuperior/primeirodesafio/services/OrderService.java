package com.devsuperior.primeirodesafio.services;

import com.devsuperior.primeirodesafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - order.getValueDiscount() + shippingService.shipment(order);
    }
}
