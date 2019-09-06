package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.HURelateDao;
import com.shortrent.myproject.generator.model.HURelate;

import javax.annotation.Resource;
import java.util.List;

public class HURelateServiceImpl implements HURelateService {
    @Resource
    HURelateDao huRelateDao;

    @Override
    public void saveHURelate(HURelate huRelate) {
        huRelateDao.insert(huRelate);
    }

    @Override
    public void deleteHURelate(Integer rId) {
        huRelateDao.deleteByPrimaryKey(rId);
    }

    @Override
    public HURelate getHURelate(Integer rId) {
        return huRelateDao.selectByPrimaryKey(rId);
    }

    @Override
    public void updateHURelate(HURelate huRelate) {
        huRelateDao.updateByPrimaryKeySelective(huRelate);
    }

    @Override
    public List<HURelate> getAll() {
        List<HURelate> huRelates=huRelateDao.selectByExample(null);
        return huRelates;
    }
}
