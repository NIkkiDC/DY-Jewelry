package com.JavaBook.JavaBook.repository;


import com.JavaBook.JavaBook.model.Jewelry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JewelryRepository extends JpaRepository<Jewelry, Long> {
    // select name from categories where name =
    Jewelry findByName(String name);
}

