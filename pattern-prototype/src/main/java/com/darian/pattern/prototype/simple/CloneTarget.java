package com.darian.pattern.prototype.simple;

import lombok.Data;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class CloneTarget extends Prototype {


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
