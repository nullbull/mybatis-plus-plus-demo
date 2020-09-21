package com.github.mybatisplusplus.demo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author System
 * @since 2020-09-21
 */
@Data
@TableName("meeting")
@EqualsAndHashCode(callSuper = false)
public class Meeting implements Serializable {


    private Long id;

    private String meetingId;

    private String hostId;

    private String topic;

    private Integer type;

    private LocalDateTime createdTime;


}
