package com.province.postdoctor.entity.daily_sci_act;

import java.time.LocalDateTime;
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
public class ProjectApplication implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer pId;

    private Integer aId;

    private String name;

    private String type;

    private String applicant;

    private String company;

    private LocalDateTime time;

    private String situation;


}
