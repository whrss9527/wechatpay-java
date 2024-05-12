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

/** SubsidiesCreateRequest */
public class SubsidiesCreateRequest {
  /** 电商平台二级商户号 说明：补差的电商平台二级商户，填写微信支付分配的商户号 */
  @SerializedName("sub_mchid")
  private String subMchid;

  /** 微信订单号 说明：微信支付订单号 */
  @SerializedName("transaction_id")
  private String transactionId;

  /** 补差金额 说明：补差金额，单位为分，只能为整数，不能超过下单时候的最大补差金额 */
  @SerializedName("amount")
  private Long amount;

  /** 补差描述 说明：补差备注描述，查询的时候原样带回来 */
  @SerializedName("description")
  private String description;

  /** 商户补差单号 说明：商户系统内部的补差单号，在商户系统内部唯一，同一补差单号多次请求等同一次。只能是数字、大小写字母_-|*@ */
  @SerializedName("out_subsidy_no")
  private String outSubsidyNo;

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getOutSubsidyNo() {
    return outSubsidyNo;
  }

  public void setOutSubsidyNo(String outSubsidyNo) {
    this.outSubsidyNo = outSubsidyNo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubsidiesCreateRequest {\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    outSubsidyNo: ").append(toIndentedString(outSubsidyNo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
