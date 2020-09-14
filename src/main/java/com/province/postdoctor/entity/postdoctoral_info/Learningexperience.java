package com.province.postdoctor.entity.postdoctoral_info;

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
public class Learningexperience implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer pId;

    private Integer pName;

    private String leStartDate;

    private String leEndDate;

    private String school;

    private String education;

    private String smName1;

    private String smName2;


}
