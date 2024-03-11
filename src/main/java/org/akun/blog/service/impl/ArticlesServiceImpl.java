package org.akun.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.akun.blog.domain.Articles;
import org.akun.blog.service.ArticlesService;
import org.akun.blog.mapper.ArticlesMapper;
import org.springframework.stereotype.Service;

/**
* @author 30612
* @description 针对表【articles】的数据库操作Service实现
* @createDate 2024-03-11 19:06:52
*/
@Service
public class ArticlesServiceImpl extends ServiceImpl<ArticlesMapper, Articles>
    implements ArticlesService{

}




