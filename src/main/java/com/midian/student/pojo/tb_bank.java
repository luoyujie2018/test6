package com.midian.student.pojo;

public class tb_bank extends tb_student {
    private String cardid;

    private Integer money;

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}