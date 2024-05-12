// Copyright 2021 Tencent Inc. All rights reserved.
//
// APP支付
//
// APP支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.partnerpayments.app.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/** PrepayRequest */
public class PrepayRequest {
  /** 服务商应用ID 说明：服务商申请的公众号appid */
  @SerializedName("sp_appid")
  private String spAppid;

  /** 服务商户号 说明：服务商户号，由微信支付生成并下发 */
  @SerializedName("sp_mchid")
  private String spMchid;

  /** 子商户应用ID 说明：子商户申请的公众号appid */
  @SerializedName("sub_appid")
  private String subAppid;

  /** 子商户号 说明：子商户的商户号，由微信支付生成并下发 */
  @SerializedName("sub_mchid")
  private String subMchid;

  /** 商品描述 说明：商品描述 */
  @SerializedName("description")
  private String description;

  /** 商户订单号 说明：商户订单号 */
  @SerializedName("out_trade_no")
  private String outTradeNo;

  /** 交易结束时间 说明：订单失效时间，格式为rfc3339格式 */
  @SerializedName("time_expire")
  private String timeExpire;

  /** 附加数据 说明：附加数据 */
  @SerializedName("attach")
  private String attach;

  /** 通知地址 说明：有效性：1. HTTPS；2. 不允许携带查询串。 */
  @SerializedName("notify_url")
  private String notifyUrl;

  /** 订单优惠标记 说明：商品标记，代金券或立减优惠功能的参数。 */
  @SerializedName("goods_tag")
  private String goodsTag;

  /** limitPay */
  public enum LimitPayEnum {
    @SerializedName("no_balance")
    NO_BALANCE,

    @SerializedName("no_credit")
    NO_CREDIT,

    @SerializedName("no_debit")
    NO_DEBIT,

    @SerializedName("balance_only")
    BALANCE_ONLY
  }

  @SerializedName("limit_pay")
  private List<LimitPayEnum> limitPay;

  /** 电子发票入口开放标识 说明：传入true时，支付成功消息和支付详情页将出现开票入口。需要在微信支付商户平台或微信公众平台开通电子发票功能，传此字段才可生效。 */
  @SerializedName("support_fapiao")
  private Boolean supportFapiao;

  /** amount */
  @SerializedName("amount")
  private Amount amount;

  /** detail */
  @SerializedName("detail")
  private Detail detail;

  /** sceneInfo */
  @SerializedName("scene_info")
  private SceneInfo sceneInfo;

  /** settleInfo */
  @SerializedName("settle_info")
  private SettleInfo settleInfo;

  public String getSpAppid() {
    return spAppid;
  }

  public void setSpAppid(String spAppid) {
    this.spAppid = spAppid;
  }

  public String getSpMchid() {
    return spMchid;
  }

  public void setSpMchid(String spMchid) {
    this.spMchid = spMchid;
  }

  public String getSubAppid() {
    return subAppid;
  }

  public void setSubAppid(String subAppid) {
    this.subAppid = subAppid;
  }

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  public String getTimeExpire() {
    return timeExpire;
  }

  public void setTimeExpire(String timeExpire) {
    this.timeExpire = timeExpire;
  }

  public String getAttach() {
    return attach;
  }

  public void setAttach(String attach) {
    this.attach = attach;
  }

  public String getNotifyUrl() {
    return notifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }

  public String getGoodsTag() {
    return goodsTag;
  }

  public void setGoodsTag(String goodsTag) {
    this.goodsTag = goodsTag;
  }

  public List<LimitPayEnum> getLimitPay() {
    return limitPay;
  }

  public void setLimitPay(List<LimitPayEnum> limitPay) {
    this.limitPay = limitPay;
  }

  public Boolean getSupportFapiao() {
    return supportFapiao;
  }

  public void setSupportFapiao(Boolean supportFapiao) {
    this.supportFapiao = supportFapiao;
  }

  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public Detail getDetail() {
    return detail;
  }

  public void setDetail(Detail detail) {
    this.detail = detail;
  }

  public SceneInfo getSceneInfo() {
    return sceneInfo;
  }

  public void setSceneInfo(SceneInfo sceneInfo) {
    this.sceneInfo = sceneInfo;
  }

  public SettleInfo getSettleInfo() {
    return settleInfo;
  }

  public void setSettleInfo(SettleInfo settleInfo) {
    this.settleInfo = settleInfo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepayRequest {\n");
    sb.append("    spAppid: ").append(toIndentedString(spAppid)).append("\n");
    sb.append("    spMchid: ").append(toIndentedString(spMchid)).append("\n");
    sb.append("    subAppid: ").append(toIndentedString(subAppid)).append("\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    timeExpire: ").append(toIndentedString(timeExpire)).append("\n");
    sb.append("    attach: ").append(toIndentedString(attach)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    goodsTag: ").append(toIndentedString(goodsTag)).append("\n");
    sb.append("    limitPay: ").append(toIndentedString(limitPay)).append("\n");
    sb.append("    supportFapiao: ").append(toIndentedString(supportFapiao)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    sceneInfo: ").append(toIndentedString(sceneInfo)).append("\n");
    sb.append("    settleInfo: ").append(toIndentedString(settleInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
