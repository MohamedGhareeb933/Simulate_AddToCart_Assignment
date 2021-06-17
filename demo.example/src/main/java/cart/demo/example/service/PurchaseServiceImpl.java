package cart.demo.example.service;

import cart.demo.example.dao.OrdersRepository;

import cart.demo.example.dao.ProductRepository;
import cart.demo.example.dto.Response;
import cart.demo.example.entity.Orders;
import cart.demo.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.*;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    private OrdersRepository ordersRepository;
    private ProductRepository productRepository;

    private Product product;

    private int calQuantity;
    private BigDecimal calPrice;

    @Autowired
    PurchaseServiceImpl(OrdersRepository ordersRepository, ProductRepository productRepository) {
        this.ordersRepository = ordersRepository;
        this.productRepository = productRepository;
        }

    @Override
    @Transactional
    public String placeOrder(Response response) {
        Orders orders = new Orders();
        calPrice = new BigDecimal(0);

        // set the Order Tracking Number to random UUID
        orders.setOrderTrackingNumber(generateOrderTrackingNumber());

        //  iterate each order_item element in the Collection
        response.getOrderItem().forEach(orderItem -> {
            product = productRepository.getById(orderItem.getProductId());
            // calculate the total price and total quantity
            calQuantity += orderItem.getQuantity();
            // simple dish of spaghet..'COUGH'
            calPrice = calPrice.add(product.getUnitPrice().multiply(new BigDecimal(orderItem.getQuantity())));

            // add order_item to order
            orders.add(orderItem);
            }
        );

        // add total_quantity and price to order
        orders.setTotalQuantity(calQuantity);
        orders.setTotalPrice(calPrice);

        // save the order
        ordersRepository.save(orders);

        return generateOrderTrackingNumber();
    }

    private String generateOrderTrackingNumber() {
        // generate Random UUID Number
        return UUID.randomUUID().toString();
    }
}
