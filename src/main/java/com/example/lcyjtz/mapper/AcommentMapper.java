package com.example.lcyjtz.mapper;

import com.example.lcyjtz.entity.Acomment;
import com.example.lcyjtz.entity.AcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcommentMapper {
    int countByExample(AcommentExample example);

    int deleteByExample(AcommentExample example);

    int deleteByPrimaryKey(Integer acommentId);

    int insert(Acomment record);

    int insertSelective(Acomment record);

    List<Acomment> selectByExample(AcommentExample example);

    Acomment selectByPrimaryKey(Integer acommentId);

    int updateByExampleSelective(@Param("record") Acomment record, @Param("example") AcommentExample example);

    int updateByExample(@Param("record") Acomment record, @Param("example") AcommentExample example);

    int updateByPrimaryKeySelective(Acomment record);

    int updateByPrimaryKey(Acomment record);
}