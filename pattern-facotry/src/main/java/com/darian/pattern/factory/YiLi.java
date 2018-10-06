package com.darian.pattern.factory;

import lombok.Data;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class YiLi implements Milk {

    private String name = "YiLi";

    @Override
    public String getName() {
        return name;
    }
}
