// Copyright 2021 Tencent Inc. All rights reserved.
//
// 银行营销对外API
//
// # 前言
// 银行营销API是专为银行商户设置的一套API。目前仅包含“创建快捷交易协议号上传任务”接口，供银行上传快捷交易协议号文件。微信侧收到文件中，将快捷交易协议号转换为微信用户id，存储到指定的号码包文件中。
//
// API version: 0.1.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.marketingbankpackages.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** FileMeta */
public class FileMeta {
  /** 文件名 说明：快捷协议号包文件名。可包含英文字母，数字，_，.，-等内容，不允许出现其他不合法符号。同一个号码包的多个上传任务的文件名不可重复，要保证唯一 */
  @SerializedName("filename")
  private String filename;

  /** 文件摘要 说明：快捷交易协议号文件的文件摘要，即快捷交易协议号文件的二进制内容进行sha256计算得到的值 */
  @SerializedName("sha256")
  private String sha256;

  /**
   * 银行类型
   * 说明：银行类型，用于标识协议号所属的银行以及卡类型(信用卡或借记卡)。采用字符串类型的银行标识，值列表详见[银行类型](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/terms_definition/chapter1_1_3.shtml#part-7)
   */
  @SerializedName("bank_type")
  private String bankType;

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  public String getBankType() {
    return bankType;
  }

  public void setBankType(String bankType) {
    this.bankType = bankType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMeta {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    bankType: ").append(toIndentedString(bankType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
