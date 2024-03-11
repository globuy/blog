package blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import blog.domain.Comments;
import blog.service.CommentsService;
import blog.mapper.CommentsMapper;
import org.springframework.stereotype.Service;

/**
* @author 30612
* @description 针对表【comments】的数据库操作Service实现
* @createDate 2024-03-11 19:06:52
*/
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments>
    implements CommentsService{

}




