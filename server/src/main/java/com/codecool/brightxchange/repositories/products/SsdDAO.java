package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.SSD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SsdDAO extends JpaRepository<SSD, Long> {
}
