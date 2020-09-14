package com.province.postdoctor.entity.postdoctoral_info;

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
public class Phdinformation implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer pId;

    private String pName;

    private String dDissertationTopic;

    private String dThesisAdvisor;

    private Integer dDegreeCertificate;

    private LocalDate ddcSignDate;

    private LocalDate ddDefenseDate;

    private String dDegreeNationality;

    private String dDoctoralUnit;

    private String dSmName1;

    private String dSmName2;

    private String ddAbstract;

    private String srHoners;


}
