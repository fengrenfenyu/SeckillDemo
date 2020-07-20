package com.JIAT.seckillDemo.mapper;

import com.JIAT.seckillDemo.pojo.SeckillOrder;
import com.JIAT.seckillDemo.pojo.SeckillOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeckillOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    long countByExample(SeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    int deleteByExample(SeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    int insert(SeckillOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    int insertSelective(SeckillOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    List<SeckillOrder> selectByExample(SeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    SeckillOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    int updateByExampleSelective(@Param("record") SeckillOrder record, @Param("example") SeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    int updateByExample(@Param("record") SeckillOrder record, @Param("example") SeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    int updateByPrimaryKeySelective(SeckillOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbg.generated Sun Jul 12 23:39:33 CST 2020
     */
    int updateByPrimaryKey(SeckillOrder record);
}