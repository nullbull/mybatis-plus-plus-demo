package com.github.mybatisplusplus.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.mybatisplusplus.core.F;
import com.github.mybatisplusplus.core.Query;
import com.github.mybatisplusplus.demo.DemoService;
import com.github.mybatisplusplus.demo.dao.MeetingMapper;
import com.github.mybatisplusplus.demo.entity.Meeting;
import com.github.mybatisplusplus.demo.entity.Room;
import com.github.mybatisplusplus.demo.manager.RoomManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author niuzhenhao
 * @date 2020/9/21 14:08
 * @desc
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoService.class)
public class MybatisPlusPlusTest {

    @Autowired
    RoomManager roomManager;

    @Autowired
    MeetingMapper meetingMapper;

    @Test
    public void simpleQuery() {
        Room one = roomManager.getOne(new LambdaQueryWrapper<Room>().eq(Room::getName, "测试会议室"));
        Assert.assertNull(one);
    }

    @Test
    public void mybatisPlusPlusQuery() {
        List<Object> meetingList = meetingMapper.selectMulti(new Query(Meeting.class)
                .joinOn(F.f(Meeting::getHostId), F.f(Room::getId))
                .eq(F.f(Room::getName), "测试会议室")
                .end());
        Assert.assertEquals(0, meetingList.size());
    }




}
