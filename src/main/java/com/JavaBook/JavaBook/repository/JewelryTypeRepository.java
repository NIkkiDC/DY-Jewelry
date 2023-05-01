package com.JavaBook.JavaBook.repository;

import com.JavaBook.JavaBook.model.JewelryType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JewelryTypeRepository extends JpaRepository<JewelryType, Long> {
    List<JewelryType> findByCategoryId(Long categoryId);


    JewelryType findByIdAndUserId(Long recipeId, Long userId);
}