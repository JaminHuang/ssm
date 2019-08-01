package com.service.impl;

import com.dao.IChurchDao;
import com.model.Church;
import com.service.IChurchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("churchService")
public class ChurchServiceImpl implements IChurchService {

    @Resource
    private IChurchDao churchDao;

    public void add(Church church) {
        churchDao.add(church);
    }

    public Church get(String churchId) {
        return churchDao.get(churchId);
    }

    public List<Church> list() {
        return churchDao.list();
    }
}
