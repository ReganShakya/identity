/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.identity.auth.configuration;

import com.web.identity.auth.entity.handler.LoginSuccessHandler;
import com.web.identity.auth.provider.UserAuthService;
import com.web.identity.filters.CustomAuthenticationFilter;
import com.web.identity.filters.JwtRequestFilter;
import com.web.identity.utils.JwtUtil;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

/**
 *
 * @author regan
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private LoginSuccessHandler successHandler;
    
    @Autowired
    private UserAuthService userAuthService;
    
    @Autowired
    private JwtRequestFilter jwtRequestFilter;
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests()
//               .antMatchers("/").permitAll()
               .anyRequest()
               .authenticated()
               .and().formLogin()
               .loginPage("/login")
               .usernameParameter("username")
               .passwordParameter("password")
               .successHandler(successHandler)
               .permitAll()
               .and().logout().permitAll()
               .invalidateHttpSession(true);
                http.addFilter(new CustomAuthenticationFilter(authenticationManagerBean()));
    }
    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//       http.csrf().disable()
//               .authorizeRequests().antMatchers("/authenticate").permitAll()
//               .anyRequest().authenticated()
//               .and().sessionManagement()
//               .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//       http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.sessionManagement().sessionCreationPolicy(STATELESS);
//        http.authorizeRequests().anyRequest().permitAll();
//        http.addFilter(new CustomAuthenticationFilter(authenticationManagerBean()));
//    }


    @Override 
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/webjars/**");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder encoder=getPasswordEncoder();        
        auth.authenticationProvider(getAuthProvider());
    }
    
    @Bean
    public DaoAuthenticationProvider getAuthProvider(){
        DaoAuthenticationProvider provider=
                new DaoAuthenticationProvider();
        provider.setPasswordEncoder(getPasswordEncoder());
        provider.setUserDetailsService(userAuthService);
        return provider;
    }
    
    @Bean
    public BCryptPasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
    @Bean 
    public JwtUtil jwtUtil() {
        return new JwtUtil();
    }
    
}
