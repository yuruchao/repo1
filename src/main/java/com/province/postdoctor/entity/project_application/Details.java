package com.province.postdoctor.entity.project_application;

import java.time.LocalDate;
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
public class Details implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer aId;

    private String pName;

    private LocalDate pTime;

    /**
     * 1Ϊ
     */
    private Integer firstApplication;

    private String project;

    private Double fundsInput;


}
