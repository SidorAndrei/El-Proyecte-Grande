package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.LaptopDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("LaptopService")
public class LaptopService{
    @Autowired
    private LaptopDAO laptopDAO;
}
