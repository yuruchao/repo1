package com.province.postdoctor.entity.resultmanage;

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
public class Thesis implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer pId;

    private String pName;

    private String tTtitle;

    private String tEtitle;

    private String academic;

    private String issueYear;

    private String issueVolume;

    private String issueTime;

    private String literature;

    private String rank;

    private String issuing;

    private String collection;

    private String ename;

    private String url;

    private String doi;

    private String wos;

    private String cremark;

    private String accessionnumber;

    private Integer cauthor;


}
