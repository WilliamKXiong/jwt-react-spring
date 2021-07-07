package com.jwt.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
 
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	@Autowired 
	JwtRequestFilter JwtRequestFilter;
	
	@Autowired
	JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	
    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService);
    }
 
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
    	//load static files, by default WebSecurity blocks them
    	//httpSecurity.authorizeRequests().antMatchers("/bootstrap/**", "/css/**","/img/**","/jquery/**","/js/**").permitAll();
    	
    	//only allow certain pages to be viewed if not logged in
    	httpSecurity.csrf().disable()
    		.authorizeRequests().antMatchers("/", "/authenticate").permitAll()
			.anyRequest().authenticated().and().
			exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    	
    	httpSecurity.addFilterBefore(JwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
    		//.and()
    		//.formLogin().loginPage("/login")
    		//.permitAll()
    		//.and()
    		//.logout().permitAll();
    }
    
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception{
    	return super.authenticationManager();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
    	return NoOpPasswordEncoder.getInstance();
    }
}