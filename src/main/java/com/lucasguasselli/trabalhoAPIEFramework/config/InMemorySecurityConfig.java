package com.lucasguasselli.trabalhoAPIEFramework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class InMemorySecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder)
			throws Exception {
			builder
			.inMemoryAuthentication()
			.withUser("lucas").password("{noop}123").roles("USER")
			.and()
			.withUser("alexandre").password("123").roles("USER")
			.and()
			.withUser("thiago").password("123").roles("USER");
			}
}
