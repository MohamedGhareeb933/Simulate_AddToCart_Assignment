package cart.demo.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "product_size")
public class ProductSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "size_type")
    private short sizeType;

    public ProductSize(short sizeType) {
        this.sizeType = sizeType;
    }

    public ProductSize() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getSizeType() {
        return sizeType;
    }

    public void setSizeType(short sizeType) {
        this.sizeType = sizeType;
    }
}
