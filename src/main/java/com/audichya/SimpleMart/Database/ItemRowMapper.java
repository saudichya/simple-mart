//package com.audichya.SimpleMart.Database;
//
//import com.audichya.SimpleMart.Model.Item;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//@Component
//public class ItemRowMapper implements RowMapper<Item> {
//
//    @Override
//    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return new Item(
//                rs.getLong("id"),
//                rs.getString("name"),
//                rs.getDouble("price")
//        );
//    }
//}
