package com.darian.pattern.factory;

import lombok.Data;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class MengNiu implements Milk {

    private String name = "MengNiu";

    @Override
    public String getName() {
        return name;
    }
}
