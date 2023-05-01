package com.JavaBook.JavaBook.service;


import com.JavaBook.JavaBook.model.JewelryType;
import com.JavaBook.JavaBook.repository.JewelryRepository;
import com.JavaBook.JavaBook.repository.JewelryTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CategoryService {
    private JewelryRepository jewelryRepository;
    private JewelryTypeRepository jewelryTypeRepository;

    @Autowired
    public void setJewelryRepository(JewelryRepository jewelryRepository) {
        this.jewelryRepository = jewelryRepository;
    }

    @Autowired
    public void setJewelryTypeRepository(JewelryTypeRepository jewelryTypeRepository) {
        this.jewelryTypeRepository = jewelryTypeRepository;
    }

}