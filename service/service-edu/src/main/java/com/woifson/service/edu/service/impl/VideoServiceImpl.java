package com.woifson.service.edu.service.impl;

import com.woifson.service.edu.entity.Video;
import com.woifson.service.edu.mapper.VideoMapper;
import com.woifson.service.edu.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程视频 服务实现类
 * </p>
 *
 * @author geSanQiang
 * @since 2020-06-01
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
