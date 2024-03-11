package org.akun.blog.mapper;

import org.akun.blog.domain.Articles;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 30612
* @description 针对表【articles】的数据库操作Mapper
* @createDate 2024-03-11 19:06:52
* @Entity blog.domain.Articles
*/
@Mapper
public interface ArticlesMapper extends BaseMapper<Articles> {

}




