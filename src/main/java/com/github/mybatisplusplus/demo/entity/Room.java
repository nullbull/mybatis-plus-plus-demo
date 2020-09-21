package com.github.mybatisplusplus.demo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author System
 * @since 2020-09-19
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

    private Integer capacity;

    private String name;

    private Integer type;

    private LocalDateTime createdTime;


}
