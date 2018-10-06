package com.darian.pattern.strategy.pay;

import lombok.Data;

/**
 * 支付完成以后的状态
 **/
public class PayState {
    private int code;
    private String msg;
    private Object data;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "[交易状态：]code=" + code +
                ", [交易详情：]data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
