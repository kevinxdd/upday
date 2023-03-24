package com.upday.common.entity;/**
 * Create by xdd on 2023/3/24.
 */

import com.upday.common.enums.ChangingStatus;

/**
 * @author xdd
 */
public abstract class Entity {

  private ChangingStatus changingStatus = ChangingStatus.UNCHANGED;

  protected void delete(){
    this.changingStatus = ChangingStatus.DELETED;
  }

  protected void isNew(){
    this.changingStatus = ChangingStatus.NEW;
  }

  protected void modify(){
    this.changingStatus = ChangingStatus.UPDATED;
  }

}
