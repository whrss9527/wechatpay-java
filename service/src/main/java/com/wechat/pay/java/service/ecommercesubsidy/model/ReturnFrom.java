// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付平台补差API
//
// 微信支付平台补差API
//
// API version: 0.1.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.ecommercesubsidy.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** ReturnFrom */
public class ReturnFrom {
  /** 出资账户类型 说明：下面枚举值多选一。 枚举值： AVAILABLE : 可用余额 UNAVAILABLE : 不可用余额 */
  @SerializedName("account")
  private ReturnAccount account;

  /** 出资金额 说明：对应账户出资金额 */
  @SerializedName("amount")
  private Long amount;

  public ReturnAccount getAccount() {
    return account;
  }

  public void setAccount(ReturnAccount account) {
    this.account = account;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnFrom {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
