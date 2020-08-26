package com.example.lcyjtz.mapper;

import com.example.lcyjtz.entity.Pcomment;
import com.example.lcyjtz.entity.PcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcommentMapper {
    int countByExample(PcommentExample example);

    int deleteByExample(PcommentExample example);

    int deleteByPrimaryKey(Integer pcommentId);

    int insert(Pcomment record);

    int insertSelective(Pcomment record);

    List<Pcomment> selectByExample(PcommentExample example);

    Pcomment selectByPrimaryKey(Integer pcommentId);

    int updateByExampleSelective(@Param("record") Pcomment record, @Param("example") PcommentExample example);

    int updateByExample(@Param("record") Pcomment record, @Param("example") PcommentExample example);

    int updateByPrimaryKeySelective(Pcomment record);

    int updateByPrimaryKey(Pcomment record);
}