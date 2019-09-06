package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.HouseDao;
import com.shortrent.myproject.generator.model.House;

import javax.annotation.Resource;
import java.util.List;

public class HouseServiceImpl implements HouseService {

    @Resource
    private HouseDao houseDao;

    @Override
    public void saveHouse(House house) {
        houseDao.insert(house);
    }

    @Override
    public void deleteHouse(Integer hId) {
        houseDao.deleteByPrimaryKey(hId);
    }

    @Override
    public House getHouse(Integer hId) {
        return houseDao.selectByPrimaryKey(hId);
    }

    @Override
    public void updateHouse(House house) {
        houseDao.updateByPrimaryKeySelective(house);
    }

    @Override
    public List<House> getAll() {
        List<House> houses=houseDao.selectByExample(null);
        return null;
    }
}
