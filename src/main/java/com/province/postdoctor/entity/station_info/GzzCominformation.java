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
public class GzzCominformation implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer dId;

    private String dName;

    private String dEname;

    private String professions;

    private String gtype;

    private String domain;

    private String chdepartment;

    private String cddepartment;

    private String comaddress;

    private Integer zipcode;

    private String fixedphone;

    private String fax;

    private String email;

    private Integer sign;


}
