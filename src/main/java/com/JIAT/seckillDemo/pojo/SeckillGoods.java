package com.JIAT.seckillDemo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SeckillGoods implements Serializable {
    private static final long serialVersionUID = 1464328592089679810L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.goods_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.item_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Long itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.title
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.small_pic
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String smallPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.price
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.cost_price
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private BigDecimal costPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.seller_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Long sellerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.create_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.check_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Date checkTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.status
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.start_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.end_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.num
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.stock_count
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private Integer stockCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.introduction
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    private String introduction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.id
     *
     * @return the value of tb_seckill_goods.id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.id
     *
     * @param id the value for tb_seckill_goods.id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.goods_id
     *
     * @return the value of tb_seckill_goods.goods_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.goods_id
     *
     * @param goodsId the value for tb_seckill_goods.goods_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.item_id
     *
     * @return the value of tb_seckill_goods.item_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.item_id
     *
     * @param itemId the value for tb_seckill_goods.item_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.title
     *
     * @return the value of tb_seckill_goods.title
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.title
     *
     * @param title the value for tb_seckill_goods.title
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.small_pic
     *
     * @return the value of tb_seckill_goods.small_pic
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getSmallPic() {
        return smallPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.small_pic
     *
     * @param smallPic the value for tb_seckill_goods.small_pic
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic == null ? null : smallPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.price
     *
     * @return the value of tb_seckill_goods.price
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.price
     *
     * @param price the value for tb_seckill_goods.price
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.cost_price
     *
     * @return the value of tb_seckill_goods.cost_price
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.cost_price
     *
     * @param costPrice the value for tb_seckill_goods.cost_price
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.seller_id
     *
     * @return the value of tb_seckill_goods.seller_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.seller_id
     *
     * @param sellerId the value for tb_seckill_goods.seller_id
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.create_time
     *
     * @return the value of tb_seckill_goods.create_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.create_time
     *
     * @param createTime the value for tb_seckill_goods.create_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.check_time
     *
     * @return the value of tb_seckill_goods.check_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.check_time
     *
     * @param checkTime the value for tb_seckill_goods.check_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.status
     *
     * @return the value of tb_seckill_goods.status
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.status
     *
     * @param status the value for tb_seckill_goods.status
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.start_time
     *
     * @return the value of tb_seckill_goods.start_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.start_time
     *
     * @param startTime the value for tb_seckill_goods.start_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.end_time
     *
     * @return the value of tb_seckill_goods.end_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.end_time
     *
     * @param endTime the value for tb_seckill_goods.end_time
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.num
     *
     * @return the value of tb_seckill_goods.num
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.num
     *
     * @param num the value for tb_seckill_goods.num
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.stock_count
     *
     * @return the value of tb_seckill_goods.stock_count
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public Integer getStockCount() {
        return stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.stock_count
     *
     * @param stockCount the value for tb_seckill_goods.stock_count
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.introduction
     *
     * @return the value of tb_seckill_goods.introduction
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.introduction
     *
     * @param introduction the value for tb_seckill_goods.introduction
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}