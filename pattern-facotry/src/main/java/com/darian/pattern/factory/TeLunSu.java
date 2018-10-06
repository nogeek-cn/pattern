package com.darian.pattern.factory;

import lombok.Data;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class TeLunSu implements Milk {

    private String name = "TeLunSu";

    @Override
    public String getName() {
        return name;
    }
}
