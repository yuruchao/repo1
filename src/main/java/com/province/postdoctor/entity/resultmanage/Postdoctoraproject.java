package com.province.postdoctor.entity.resultmanage;

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
public class Postdoctoraproject implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer pId;

    private String pName;

    private String projectName;

    private String departmentName;

    private String projectNature;

    private String projectProgress;

    private String projectSum;

    private LocalDate approveTime;

    private String duty;


}
