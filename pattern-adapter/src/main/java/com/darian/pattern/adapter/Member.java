package com.darian.pattern.adapter;

import lombok.Builder;
import lombok.Data;

/**
 * <br>
 * <br>Darian
 **/
@Data
@Builder
public class Member {
    private String userName;
    private String password;
    private String mid;
    private String info;
}
