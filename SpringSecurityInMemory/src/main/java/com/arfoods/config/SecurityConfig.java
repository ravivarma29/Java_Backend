package com.arfoods.config;

import com.arfoods.SpringSecurityInMemoryApplication;
import com.arfoods.controller.SimpleController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class SecurityConfig {
	

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder)
	{
		
		System.out.println(passwordEncoder.encode("Ravi@123"));
		System.out.println(passwordEncoder.encode("Anshu@123"));
		UserDetails user1 = User.builder().
				username("Ravi")
				.password(passwordEncoder.encode("Ravi@123"))
				.build();
				
		
		UserDetails user2 = User.builder().
				username("anshu")
				.password(passwordEncoder.encode("Anshu@123"))
				.build();
		
		return new InMemoryUserDetailsManager(user1,user2);
							
	}
	
	@Bean
	public SecurityFilterChain defaulSecurityFilterChain(HttpSecurity httpSecurity)
	{
		httpSecurity
					.authorizeHttpRequests(
					auth ->
					auth.requestMatchers("/hi","/bye").authenticated()
					.requestMatchers("/open").permitAll()	
					.requestMatchers("/noAccess").denyAll()
					)
					.formLogin(Customizer.withDefaults())
					.httpBasic(Customizer.withDefaults());
		
		return httpSecurity.build();
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
}
	
