package cart.demo.example.entity;

import javax.persistence.*;

@Entity
@Table(name="order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    @Column(name="product_id")
    private Long productId;

    @Column(name = "size_id")
    private Long size;

    public OrderItem(int quantity, Orders order, Long productId, Long size) {
        this.quantity = quantity;
        this.order = order;
        this.productId = productId;
        this.size = size;
    }

    public OrderItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}


