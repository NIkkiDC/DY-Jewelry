package com.JavaBook.JavaBook.repository;


import com.JavaBook.JavaBook.model.Jewelry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JewelryRepository extends JpaRepository<Jewelry, Long> {
    // select name from categories where name =
    Jewelry findByName(String name);

    List<Jewelry> findByUserId(Long userId);
}

