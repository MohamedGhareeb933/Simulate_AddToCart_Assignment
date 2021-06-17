package cart.demo.example.dao;

import cart.demo.example.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RepositoryRestResource( collectionResourceRel = "product", path = "products")
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

}
