package com.darian.pattern.template.dao;

import com.darian.pattern.template.JdbcTemplate;
import com.darian.pattern.template.RowMapper;
import com.darian.pattern.template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;


/**
 * 解耦
 * 抽象类  >>>>>>>>  实现接口
 * <br>Darian
 **/
public class MemberDao {

    // 为什么不继承，主要是为了解耦
    // 类似于静态代理，静态代理 JDBCTemplate 的一些方法
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<?> query() {
        String sql = "SELECT * FROM t_member";
        return jdbcTemplate.executeQuery(sql, new RowMapper<Object>() {
            public Object mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUserName(rs.getString("userName"));
                member.setPassWord(rs.getString("passWord"));
                member.setAge(rs.getInt("age"));
                return member;
            }
        }, null);
    }
}
