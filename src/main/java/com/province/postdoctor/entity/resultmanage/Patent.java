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
public class Patent implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer pId;

    private String pName;

    private String patentName;

    private LocalDate papplydate;

    private String pnumber;

    private LocalDate opendate;

    private String onumber;

    private String inventor;

    private String patenter;

    private String ptype;

    private Integer authorized;

    private Integer rank;

    private String papprove;

    private String pbrief;


}
