package cart.demo.example.dto;

import cart.demo.example.entity.OrderItem;

import java.util.Set;

// Data Transfer Object
public class Response {

    private Set<OrderItem> orderItem;

    public Response(Set<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public Response() {
    }

    public Set<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Set<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }
}
