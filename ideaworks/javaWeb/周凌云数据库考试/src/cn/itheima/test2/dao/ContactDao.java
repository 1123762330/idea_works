package cn.itheima.test2.dao;

import cn.itheima.test2.entity.Contact;
import cn.itheima.test2.utils.DataSourceUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class ContactDao {
    public List<Contact> findMyContact(){
        JdbcTemplate template = new JdbcTemplate(DataSourceUtils.getDataSource());
        String sql ="SELECT * FROM contact";
        List<Contact> list = template.query(sql, new BeanPropertyRowMapper<Contact>(Contact.class));
        return  list;
    }
}
