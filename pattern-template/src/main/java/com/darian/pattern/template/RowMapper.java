package com.darian.pattern.template;

import java.sql.ResultSet;

/**
 * <br>
 * <br>Darian
 **/
public interface RowMapper<T> {
    public T mapRow(ResultSet rs, int rowNum) throws Exception;

}
