package com.hai.dao;

import com.hai.entity.Version;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Version record);

    int insertSelective(Version record);

    Version selectByPrimaryKey(Integer id);

    Version selectByVersionCode(String versionCode);

    List<Version> selectVersions();

    List<Version> selectByAppKey(@Param("appKey") String appKey);

    int updateByPrimaryKeySelective(Version record);

    int updateByPrimaryKey(Version record);
}