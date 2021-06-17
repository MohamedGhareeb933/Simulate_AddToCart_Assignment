package cart.demo.example.dao;

import cart.demo.example.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource( collectionResourceRel = "productCategory", path = "categories")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
