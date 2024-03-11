package blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import blog.domain.Users;
import blog.service.UsersService;
import blog.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author 30612
* @description 针对表【users】的数据库操作Service实现
* @createDate 2024-03-11 19:06:52
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




