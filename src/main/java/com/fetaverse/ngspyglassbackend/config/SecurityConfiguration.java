package com.fetaverse.ngspyglassbackend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

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

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.csrf().disable();
        http.authorizeHttpRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll();
        http.authorizeHttpRequests().mvcMatchers("/**").permitAll();
        http.authorizeHttpRequests().mvcMatchers("/register").permitAll();
        http.logout().deleteCookies("JSESSIONID").invalidateHttpSession(true);
    }
}
