package com.hai.dao;

import com.hai.entity.Patch;
import com.hai.entity.PatchExample;
import com.hai.entity.PatchWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatchMapper {
    long countByExample(PatchExample example);

    int deleteByExample(PatchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PatchWithBLOBs record);

    int insertSelective(PatchWithBLOBs record);

    List<PatchWithBLOBs> selectByExampleWithBLOBs(PatchExample example);

    List<Patch> selectByExample(PatchExample example);

    PatchWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PatchWithBLOBs record, @Param("example") PatchExample example);

    int updateByExampleWithBLOBs(@Param("record") PatchWithBLOBs record, @Param("example") PatchExample example);

    int updateByExample(@Param("record") Patch record, @Param("example") PatchExample example);

    int updateByPrimaryKeySelective(PatchWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PatchWithBLOBs record);

    int updateByPrimaryKey(Patch record);
}