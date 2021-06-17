package cart.demo.example.dao;

import cart.demo.example.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource( collectionResourceRel = "orderItem", path = "orderItem")
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
