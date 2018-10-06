package com.darian.pattern.adapter;

import lombok.Data;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class ResultMsg {
    private String code;
    private String msg;
    private Object data;

    public ResultMsg(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
