package cart.demo.example.config;

import cart.demo.example.entity.Product;
import cart.demo.example.entity.ProductCategory;
import cart.demo.example.entity.ProductSize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    EntityManager entityManager;

    @Autowired
    MyDataRestConfig(EntityManager entityManager) {this.entityManager = entityManager;}

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        unSupportedMethods(config);
        ExposeId(config);
    }

    // Disable Http Methods {DELETE, POST, PUT} for Product and Category,... Classes
    private void unSupportedMethods(RepositoryRestConfiguration config) {
        HttpMethod[] unSupported = {HttpMethod.DELETE, HttpMethod.POST, HttpMethod.PUT};

        DisapleHttpMethod(config, Product.class, unSupported);
        DisapleHttpMethod(config, ProductCategory.class, unSupported);
        DisapleHttpMethod(config, ProductSize.class, unSupported);

    }

    private void DisapleHttpMethod(RepositoryRestConfiguration config, Class theClass, HttpMethod[] unSupported) {
        config.getExposureConfiguration().forDomainType(theClass)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unSupported))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unSupported));
    }

    // Expose the Entity ID
    private void ExposeId(RepositoryRestConfiguration config) {

        // - get a list of all entity classes from the entity manager
        Set<EntityType<?> > entities = entityManager.getMetamodel().getEntities();

        List<Class> entityClass = new ArrayList<>();

        // get the Java Type of entity and push into List
        for(EntityType entity : entities) {
            entityClass.add(entity.getJavaType());
        }

        // Map the Collection into array and Expose the id
        Class[] domainType = entityClass.toArray(new Class[0]);
        config.exposeIdsFor(domainType);
    }
}
