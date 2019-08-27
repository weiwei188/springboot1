package com.prd.mybatis.dao;

import com.prd.mybatis.entity.LuckyMoney;
import org.springframework.stereotype.Component;

@Component
public interface LuckyMoneyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LuckyMoney record);

    int insertSelective(LuckyMoney record);

    LuckyMoney selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LuckyMoney record);

    int updateByPrimaryKey(LuckyMoney record);
}