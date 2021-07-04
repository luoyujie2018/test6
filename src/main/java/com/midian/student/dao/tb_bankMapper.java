package com.midian.student.dao;

import com.midian.student.pojo.tb_bank;

public interface tb_bankMapper {
    int deleteByPrimaryKey(String cardid);

    int insert(tb_bank record);

    int insertSelective(tb_bank record);

    tb_bank selectByPrimaryKey(String cardid);

    int updateByPrimaryKeySelective(tb_bank record);

    int updateByPrimaryKey(tb_bank record);
}