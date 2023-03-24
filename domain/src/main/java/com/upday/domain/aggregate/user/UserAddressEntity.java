package com.upday.domain.aggregate.user;
/**
 * Create by xdd on 2023/3/23.
 */

import com.upday.common.entity.Entity;
import com.upday.domain.aggregate.user.dto.UserAddressDTO;
import lombok.Getter;

/**
 *  用户地址对象
 *
 * @author xdd
 */
@Getter
public class UserAddressEntity extends Entity {

  private String addressId;

  private String receiveName;

  private String mobile;

  private Long provinceId;

  private String provinceName;

  private Long cityId;

  private String cityName;

  private Long districtId;

  private String districtName;

  UserAddressEntity(String receiveName, String mobile, Long provinceId, String provinceName,
      Long cityId, String cityName, Long districtId, String districtName) {
    this.receiveName = receiveName;
    this.mobile = mobile;
    this.provinceId = provinceId;
    this.provinceName = provinceName;
    this.cityId = cityId;
    this.cityName = cityName;
    this.districtId = districtId;
    this.districtName = districtName;
  }

  /**
   *  作废自身
   */
  void excision() {
    super.delete();
  }

  /**
   *  变更
   * @param dto 变更业务数据
   */
  void update(UserAddressDTO dto) {
    this.receiveName = dto.getReceiveName();
    // ....其他修改省略
    modify();
  }
}
