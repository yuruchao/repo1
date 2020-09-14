package com.province.postdoctor.entity.project_application;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author YRC
 * @since 2020-09-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SubsidiesApplication implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("w_Id")
    private Integer wId;

    private Integer fId;

    private String company;

    private Integer account;

    private String standInfo;

    private String limits;

    private LocalDate time;

    private Integer sign;


}
