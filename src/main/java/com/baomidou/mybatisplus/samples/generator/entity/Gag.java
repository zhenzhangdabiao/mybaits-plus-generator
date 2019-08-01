package com.baomidou.mybatisplus.samples.generator.entity;

import com.baomidou.mybatisplus.samples.generator.common.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-08-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Gag extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private LocalDateTime createTime;

    private LocalDate gagTime;

    private Long userId;


}
