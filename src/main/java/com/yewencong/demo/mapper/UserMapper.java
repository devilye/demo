package com.yewencong.demo.mapper;

import com.yewencong.demo.Dao.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserInfo getUserInfo(UserInfo user);

}
