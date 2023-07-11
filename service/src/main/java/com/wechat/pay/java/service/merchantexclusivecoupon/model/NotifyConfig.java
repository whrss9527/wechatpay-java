// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销商家券对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.0.11

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.merchantexclusivecoupon.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** NotifyConfig */
public class NotifyConfig {
  /**
   * 事件通知AppID
   * 说明：用于回调通知时，计算返回操作用户的OpenID（诸如领券用户），支持小程序or公众号的AppID；如该字段不填写，则回调通知中涉及到用户身份信息的OpenID与UnionID都将为空。
   */
  @SerializedName("notify_appid")
  private String notifyAppid;

  public String getNotifyAppid() {
    return notifyAppid;
  }

  public void setNotifyAppid(String notifyAppid) {
    this.notifyAppid = notifyAppid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyConfig {\n");
    sb.append("    notifyAppid: ").append(toIndentedString(notifyAppid)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}