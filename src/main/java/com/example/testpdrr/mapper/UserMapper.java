package com.example.testpdrr.mapper;

import com.hqs.pojo.BlogComment;
import com.hqs.pojo.BolgDetail;
import com.hqs.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User login(String userName, String password);

    List<BolgDetail> selectAll();

    int inster1(BlogComment blogComment);
}
