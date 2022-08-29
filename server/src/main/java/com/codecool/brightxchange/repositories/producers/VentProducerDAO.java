package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.VentProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VentProducerDAO extends JpaRepository<VentProducer, Long> {
    @Modifying
    @Query("update VentProducer vp set vp.name = :name where vp.id = :id")
    void update(@Param("id") float id,
                @Param("name") String name);
}
