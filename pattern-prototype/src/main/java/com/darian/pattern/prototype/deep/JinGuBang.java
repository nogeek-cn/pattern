package com.darian.pattern.prototype.deep;

import lombok.Data;

import java.io.Serializable;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class JinGuBang implements Serializable {
    private float h = 100;
    private float d = 1;

    public void big() {
        this.h *= 2;
        this.d *= 2;
    }

    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
