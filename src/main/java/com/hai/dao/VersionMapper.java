package com.hai.dao;

import com.hai.entity.Version;

import java.util.List;

public interface VersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Version record);

    int insertSelective(Version record);

    Version selectByPrimaryKey(Integer id);

    List<Version> selectVersions();

    int updateByPrimaryKeySelective(Version record);

    int updateByPrimaryKey(Version record);
}