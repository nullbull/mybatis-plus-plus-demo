package com.github.mybatisplusplus.demo.manager.impl;

import com.github.mybatisplusplus.demo.entity.Meeting;
import com.github.mybatisplusplus.demo.dao.MeetingMapper;
import com.github.mybatisplusplus.demo.manager.MeetingManager;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author System
 * @since 2020-09-21
 */
@Service
public class MeetingManagerImpl extends ServiceImpl<MeetingMapper, Meeting> implements MeetingManager {

}
