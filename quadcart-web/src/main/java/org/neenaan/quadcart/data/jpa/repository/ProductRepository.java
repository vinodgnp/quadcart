package org.neenaan.quadcart.data.jpa.repository;

import org.neenaan.quadcart.data.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
