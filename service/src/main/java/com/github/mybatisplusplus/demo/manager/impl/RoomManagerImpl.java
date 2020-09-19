package com.github.mybatisplusplus.demo.manager.impl;

import com.github.mybatisplusplus.demo.entity.Room;
import com.github.mybatisplusplus.demo.dao.RoomMapper;
import com.github.mybatisplusplus.demo.manager.RoomManager;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author System
 * @since 2020-09-19
 */
@Service
public class RoomManagerImpl extends ServiceImpl<RoomMapper, Room> implements RoomManager {

}
