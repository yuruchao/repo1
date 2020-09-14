package com.province.postdoctor.entity.daily_sci_act;

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
public class MeetingInformation implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer pId;

    private Integer dId;

    private String meetingName;

    private LocalDate meetingtime;

    private String place;

    private Integer inCountry;

    private Integer inProvince;


}
