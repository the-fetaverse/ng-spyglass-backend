//package com.fetaverse.ngspyglassbackend.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//
//import javax.sql.DataSource;
//
//// Spring will auto @Import this configuration class
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    private PasswordEncoder encoder;
//
//    @Autowired
//    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(encoder);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic();
//        // Use this with X-XSRF-TOKEN in headers in production:
//        // http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//        http.csrf().disable(); // This should not be in production
//        http.authorizeHttpRequests().mvcMatchers("/hello/**").authenticated();
//        http.authorizeHttpRequests().mvcMatchers("/**").permitAll();
//        http.authorizeHttpRequests().mvcMatchers("/register").permitAll();
//        http.logout().deleteCookies("JSESSIONID").invalidateHttpSession(true);
//    }
//}
