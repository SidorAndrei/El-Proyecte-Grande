package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.PowerSupplyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PowerSupplyService")
public class PowerSupplyService {
    private final PowerSupplyDAO powerSupplyDAO;

    public PowerSupplyService(PowerSupplyDAO powerSupplyDAO) {
        this.powerSupplyDAO = powerSupplyDAO;
    }
}
