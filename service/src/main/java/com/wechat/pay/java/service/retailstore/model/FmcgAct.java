// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销加价购对外API
//
// 指定服务商可通过该接口报名加价购活动、查询某个区域内的加价购活动列表、锁定加价活动购资格以及解锁加价购活动资格。
//
// API version: 1.4.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.retailstore.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** FmcgAct */
public class FmcgAct {
  /** 活动ID 说明：活动ID */
  @SerializedName("activity_id")
  private String activityId;
  /** 品牌ID 说明：品牌ID */
  @SerializedName("brand_id")
  private String brandId;
  /** 活动创建方商户号 说明：活动创建方商户号 */
  @SerializedName("creator_merchant_id")
  private String creatorMerchantId;
  /** 活动信息 说明：活动信息 */
  @SerializedName("activity_info")
  private ActInfo activityInfo;
  /** 活动商品信息 说明：活动商品列表 */
  @SerializedName("goods_information")
  private GoodsInfo goodsInformation;
  /** 活动规则 说明：活动规则 */
  @SerializedName("rule_information")
  private ActRule ruleInformation;

  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public String getCreatorMerchantId() {
    return creatorMerchantId;
  }

  public void setCreatorMerchantId(String creatorMerchantId) {
    this.creatorMerchantId = creatorMerchantId;
  }

  public ActInfo getActivityInfo() {
    return activityInfo;
  }

  public void setActivityInfo(ActInfo activityInfo) {
    this.activityInfo = activityInfo;
  }

  public GoodsInfo getGoodsInformation() {
    return goodsInformation;
  }

  public void setGoodsInformation(GoodsInfo goodsInformation) {
    this.goodsInformation = goodsInformation;
  }

  public ActRule getRuleInformation() {
    return ruleInformation;
  }

  public void setRuleInformation(ActRule ruleInformation) {
    this.ruleInformation = ruleInformation;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FmcgAct {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    creatorMerchantId: ").append(toIndentedString(creatorMerchantId)).append("\n");
    sb.append("    activityInfo: ").append(toIndentedString(activityInfo)).append("\n");
    sb.append("    goodsInformation: ").append(toIndentedString(goodsInformation)).append("\n");
    sb.append("    ruleInformation: ").append(toIndentedString(ruleInformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
