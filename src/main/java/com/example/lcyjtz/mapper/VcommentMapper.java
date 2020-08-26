package com.example.lcyjtz.mapper;

import com.example.lcyjtz.entity.Vcomment;
import com.example.lcyjtz.entity.VcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VcommentMapper {
    int countByExample(VcommentExample example);

    int deleteByExample(VcommentExample example);

    int deleteByPrimaryKey(Integer vcommentId);

    int insert(Vcomment record);

    int insertSelective(Vcomment record);

    List<Vcomment> selectByExample(VcommentExample example);

    Vcomment selectByPrimaryKey(Integer vcommentId);

    int updateByExampleSelective(@Param("record") Vcomment record, @Param("example") VcommentExample example);

    int updateByExample(@Param("record") Vcomment record, @Param("example") VcommentExample example);

    int updateByPrimaryKeySelective(Vcomment record);

    int updateByPrimaryKey(Vcomment record);
}