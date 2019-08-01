package com.baomidou.mybatisplus.samples.generator.entity;

import com.baomidou.mybatisplus.samples.generator.common.BaseEntity;
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
public class Score extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String changeType;

    private LocalDateTime createTime;

    private Integer score;

    private Long userId;


}
