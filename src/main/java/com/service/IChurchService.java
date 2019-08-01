package com.service;

import com.model.Church;

import java.util.List;

public interface IChurchService {
    /**
     * 添加团契信息
     * @param church 团契信息
     */
    void add(Church church);

    /**
     * 获取指定团契信息
     * @param churchId 团契标识
     * @return 团契对象
     */
    Church get(String churchId);

    /**
     * 获取团契列表
     * @return 团契列表
     */
    List<Church> list();
}
