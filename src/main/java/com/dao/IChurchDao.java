package com.dao;

import com.model.Church;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface IChurchDao {

    /**
     * 添加团契信息
     * @param church 团契信息
     */
    @Insert("INSERT INTO Church(ChurchId, ChurchName, Logo, UpdateTime) VALUES(#{churchId},#{churchName},#{logo},#{updateTime})")
    void add(Church church);

    /**
     * 获取指定团契信息
     * @param churchId 团契标识
     * @return 团契对象
     */
    @Select("SELECT * FROM Church WHERE ChurchId = #{churchId}")
    Church get(String churchId);

    /**
     * 获取团契列表
     * @return 团契列表
     */
    @Select("SELECT * FROM Church")
    List<Church> list();
}
