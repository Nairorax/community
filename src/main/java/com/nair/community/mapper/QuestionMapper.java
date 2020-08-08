package com.nair.community.mapper;

import com.nair.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface QuestionMapper {

    @Insert("insert into (title,description,gmt_create,gmt_modified,creator) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    public void create(Question question);
}
