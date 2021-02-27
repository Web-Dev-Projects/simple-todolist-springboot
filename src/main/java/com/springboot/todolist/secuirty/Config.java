package com.springboot.todolist.secuirty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
            .authorizeRequests((authorize) -> authorize
                .antMatchers("/").permitAll()
                .antMatchers("/*todo*/**").hasRole("USER")
            )
            .formLogin();
	}

    @Bean
	public UserDetailsService userDetailsService() {
		UserDetails userDetails = User
                .withDefaultPasswordEncoder()
				.username("shehab")
				.password("shehab")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(userDetails);
	}
}