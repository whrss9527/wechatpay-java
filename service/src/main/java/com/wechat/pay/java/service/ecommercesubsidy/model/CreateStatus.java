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

import com.google.gson.annotations.SerializedName;

/** CreateStatus */
public enum CreateStatus {
  @SerializedName("SUCCESS")
  SUCCESS,

  @SerializedName("FAIL")
  FAIL,

  @SerializedName("REFUND")
  REFUND
}