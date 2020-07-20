package com.JIAT.seckillDemo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SeckillOrder implements Serializable {
    private static final long serialVersionUID = 1464328592089679810L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.seckill_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Long seckillId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.money
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.uer_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String uerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.seller_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String sellerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.create_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.pay_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.status
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.recevier_address
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String recevierAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.recevier_mobile
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String recevierMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.recevier
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String recevier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.transaction_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String transactionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.id
     *
     * @return the value of tb_seckill_order.id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.id
     *
     * @param id the value for tb_seckill_order.id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.seckill_id
     *
     * @return the value of tb_seckill_order.seckill_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Long getSeckillId() {
        return seckillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.seckill_id
     *
     * @param seckillId the value for tb_seckill_order.seckill_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.money
     *
     * @return the value of tb_seckill_order.money
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.money
     *
     * @param money the value for tb_seckill_order.money
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.uer_id
     *
     * @return the value of tb_seckill_order.uer_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getUerId() {
        return uerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.uer_id
     *
     * @param uerId the value for tb_seckill_order.uer_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setUerId(String uerId) {
        this.uerId = uerId == null ? null : uerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.seller_id
     *
     * @return the value of tb_seckill_order.seller_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.seller_id
     *
     * @param sellerId the value for tb_seckill_order.seller_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.create_time
     *
     * @return the value of tb_seckill_order.create_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.create_time
     *
     * @param createTime the value for tb_seckill_order.create_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.pay_time
     *
     * @return the value of tb_seckill_order.pay_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.pay_time
     *
     * @param payTime the value for tb_seckill_order.pay_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.status
     *
     * @return the value of tb_seckill_order.status
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.status
     *
     * @param status the value for tb_seckill_order.status
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.recevier_address
     *
     * @return the value of tb_seckill_order.recevier_address
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getRecevierAddress() {
        return recevierAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.recevier_address
     *
     * @param recevierAddress the value for tb_seckill_order.recevier_address
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setRecevierAddress(String recevierAddress) {
        this.recevierAddress = recevierAddress == null ? null : recevierAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.recevier_mobile
     *
     * @return the value of tb_seckill_order.recevier_mobile
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getRecevierMobile() {
        return recevierMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.recevier_mobile
     *
     * @param recevierMobile the value for tb_seckill_order.recevier_mobile
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setRecevierMobile(String recevierMobile) {
        this.recevierMobile = recevierMobile == null ? null : recevierMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.recevier
     *
     * @return the value of tb_seckill_order.recevier
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getRecevier() {
        return recevier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.recevier
     *
     * @param recevier the value for tb_seckill_order.recevier
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setRecevier(String recevier) {
        this.recevier = recevier == null ? null : recevier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.transaction_id
     *
     * @return the value of tb_seckill_order.transaction_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.transaction_id
     *
     * @param transactionId the value for tb_seckill_order.transaction_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }
}