package com.ecc.sycoracle.mapper;

import com.ecc.sycoracle.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sunyc
 * @create 2022-07-05 16:12
 */
@Mapper
public interface UserMapper {
    @Select("select * from xulei.syc_user")
    public List<User> getAll();
}
