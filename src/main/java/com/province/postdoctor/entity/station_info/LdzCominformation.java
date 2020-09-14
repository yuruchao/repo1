package com.province.postdoctor.entity.station_info;

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
public class LdzCominformation implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer dId;

    private String dEname;

    private String dName;

    private String department;

    private String cddepartment;

    private String aname;

    private String comaddress;

    private Integer zipcode;

    private String fixedphone;

    private String fax;

    private Integer phone;

    private String email;


}
