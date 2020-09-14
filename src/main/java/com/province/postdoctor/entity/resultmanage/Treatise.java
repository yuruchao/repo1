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
public class Treatise implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer pId;

    private String pName;

    private String treatiseName;

    private String treatiseNumber;

    private String press;

    private LocalDate publicationDate;

    private String treatiseMode;

    private Integer authorRank;


}
