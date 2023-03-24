package com.upday.infrastructure.po;
/**
 * Create by xdd on 2023/3/23.
 */

import lombok.Data;

/**
 *  用户地址PO
 *
 * @author xdd
 */
@Data
public class UserAddressPO {

  private String addressId;

  private Long userId;

  private String receiveName;

  private String mobile;

  private Long provinceId;

  private String provinceName;

  private Long cityId;

  private String cityName;

  private Long districtId;

  private String districtName;

}
