package com.woifson.service.edu.service.impl;

import com.woifson.service.edu.entity.Comment;
import com.woifson.service.edu.mapper.CommentMapper;
import com.woifson.service.edu.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论 服务实现类
 * </p>
 *
 * @author geSanQiang
 * @since 2020-06-01
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
