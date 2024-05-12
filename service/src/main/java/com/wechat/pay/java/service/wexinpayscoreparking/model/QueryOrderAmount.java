// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付分停车服务
//
// 微信支付分停车服务 扣费API
//
// API version: 1.2.1

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.wexinpayscoreparking.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** QueryOrderAmount */
public class QueryOrderAmount {
  /** 订单金额 说明：订单总金额，单位为分，只能为整数，详见支付金额 */
  @SerializedName("total")
  private Long total;

  /** 货币类型 说明：符合ISO 4217标准的三位字母代码，目前只支持人民币：CNY */
  @SerializedName("currency")
  private String currency;

  /** 用户实际支付金额 说明：用户实际支付金额，单位为分，只能为整数，详见支付金额 */
  @SerializedName("payer_total")
  private Long payerTotal;

  /** 折扣 说明：订单折扣 */
  @SerializedName("discount_total")
  private Long discountTotal;

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Long getPayerTotal() {
    return payerTotal;
  }

  public void setPayerTotal(Long payerTotal) {
    this.payerTotal = payerTotal;
  }

  public Long getDiscountTotal() {
    return discountTotal;
  }

  public void setDiscountTotal(Long discountTotal) {
    this.discountTotal = discountTotal;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOrderAmount {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    payerTotal: ").append(toIndentedString(payerTotal)).append("\n");
    sb.append("    discountTotal: ").append(toIndentedString(discountTotal)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
