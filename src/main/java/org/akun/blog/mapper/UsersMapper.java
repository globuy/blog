package org.akun.blog.mapper;

import org.akun.blog.domain.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 30612
* @description 针对表【users】的数据库操作Mapper
* @createDate 2024-03-11 19:06:52
* @Entity blog.domain.Users
*/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}




