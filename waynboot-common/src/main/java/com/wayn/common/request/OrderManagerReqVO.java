package com.wayn.common.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单列表请求
 */
@Data
public class OrderManagerReqVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 3129813461714576208L;

    /**
     * 订单id
     */
    private Long id;

    /**
     * 用户表的用户ID
     */
    private Long userId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 订单状态
     */
    private Short orderStatus;

    /**
     * 售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消
     */
    private Short aftersaleStatus;

    /**
     * 收货人名称
     */
    private String consignee;

    /**
     * 收货人手机号
     */
    private String mobile;

    /**
     * 收货具体地址
     */
    private String address;

    /**
     * 用户订单留言
     */
    private String message;

    /**
     * 商品总费用
     */
    private BigDecimal goodsPrice;

    /**
     * 配送费用
     */
    private BigDecimal freightPrice;

    /**
     * 优惠券减免
     */
    private BigDecimal couponPrice;


    /**
     * 订单费用， = goods_price + freight_price - coupon_price
     */
    private BigDecimal orderPrice;

    /**
     * 实付费用， = order_price - integral_price
     */
    private BigDecimal actualPrice;

    /**
     * 付款编号
     */
    private String payId;

    /**
     * 支付方式 1微信 2支付宝
     *
     * @see com.wayn.common.design.strategy.pay.PayTypeEnum
     */
    private Integer payType;

    /**
     * 付款时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime payTime;

    /**
     * 发货编号
     */
    private String shipSn;

    /**
     * 发货快递公司
     */
    private String shipChannel;

    /**
     * 发货开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime shipTime;

    /**
     * 退款状态 0未退款 1申请退款 2退款成功 3退款失败
     */
    private Integer refundStatus;

    /**
     * 实际退款金额，（有可能退款金额小于实际支付金额）
     */
    private BigDecimal refundAmount;

    /**
     * 退款方式
     */
    private Integer refundType;

    /**
     * 退款备注
     */
    private String refundContent;

    /**
     * 退款时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime refundTime;

    /**
     * 用户确认收货时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime confirmTime;

    /**
     * 待评价订单商品数量
     */
    private Integer comments;

    /**
     * 订单关闭时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderEndTime;

    /**
     * 开始时间
     */
    @JsonIgnore
    private String startTime;

    /**
     * 结束时间
     */
    @JsonIgnore
    private String endTime;

}
