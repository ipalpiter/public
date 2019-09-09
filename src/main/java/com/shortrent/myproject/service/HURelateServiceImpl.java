package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.HURelateDao;
import com.shortrent.myproject.generator.model.HURelate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
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
