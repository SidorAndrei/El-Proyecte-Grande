package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.FrontPanelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("FrontPanelService")
public class FrontPanelService implements FrontPanelDAO {
    @Autowired
    @Qualifier("FrontPanelMemory")
    private FrontPanelDAO frontPanelDAO;
}
