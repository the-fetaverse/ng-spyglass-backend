//package com.fetaverse.ngspyglassbackend.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.sql.Types;
//
//@Service
//public class RegistrationService {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    private PasswordEncoder encoder;
//
//    /**
//     * Registers a given user:
//     * @param username: String
//     * @param password: String
//     */
//    public void register(String username, String password) {
//        String userSql = "insert into users values (?, ?, true)";
//        String authzSql = "insert into authorities values (?, 'ROLE_USER')";
//
//        jdbcTemplate.update(userSql, new String[] {username, encoder.encode(password)},
//                new int[] {Types.VARCHAR, Types.VARCHAR});
//        jdbcTemplate.update(authzSql, new String[] {username}, new int[] {Types.VARCHAR});
//    }
//}
