package ma.emsi.chidoub.billingservice.repository;

import ma.emsi.chidoub.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}