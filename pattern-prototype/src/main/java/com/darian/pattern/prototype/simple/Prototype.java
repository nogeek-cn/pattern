package com.darian.pattern.prototype.simple;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class Prototype  implements  Cloneable{
    private String name;
    private CloneTarget cloneTarget;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
