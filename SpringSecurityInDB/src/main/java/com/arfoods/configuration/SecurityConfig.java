package com.arfoods.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.arfoods.service.PersonService;

@Configuration
public class SecurityConfig {
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)
	{
		
		http
		.csrf(csrf->csrf.disable())
			.authorizeHttpRequests(
			auth ->
				auth.requestMatchers("/users/signup")
				.permitAll()
				.anyRequest()
				.authenticated()
				)
			.formLogin(Customizer.withDefaults())
			.httpBasic(Customizer.withDefaults());
			
		return http.build();
			
	}

}
