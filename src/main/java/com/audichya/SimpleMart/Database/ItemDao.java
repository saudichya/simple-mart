//package com.audichya.SimpleMart.Database;
//
//import com.audichya.SimpleMart.Model.Item;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class ItemDao {
//
//    private final JdbcTemplate jdbcTemplate;
//    private final ItemRowMapper itemRowMapper;
//
//    public ItemDao(JdbcTemplate jdbcTemplate, ItemRowMapper itemRowMapper) {
//        this.jdbcTemplate = jdbcTemplate;
//        this.itemRowMapper = itemRowMapper;
//    }
//
//    public List<Item> getAllItems() {
//        var sql = """
//                SELECT id, name, price
//                FROM items
//                LIMIT 1000
//                """;
//
//        return jdbcTemplate.query(sql, itemRowMapper);
//    }
//
//}
