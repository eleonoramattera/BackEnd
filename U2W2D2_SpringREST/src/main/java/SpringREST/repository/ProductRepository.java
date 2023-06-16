package SpringREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringREST.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
