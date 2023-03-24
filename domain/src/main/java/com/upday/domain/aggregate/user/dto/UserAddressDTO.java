package com.upday.domain.aggregate.user.dto;/**
 * Create by xdd on 2023/3/24.
 */

import lombok.Data;

/**
 * @author xdd
 */
@Data
public class UserAddressDTO {

  private String addressId;

  private String receiveName;

  private String mobile;

  private Long provinceId;

  private String provinceName;

  private Long cityId;

  private String cityName;

  private Long districtId;

  private String districtName;

}
