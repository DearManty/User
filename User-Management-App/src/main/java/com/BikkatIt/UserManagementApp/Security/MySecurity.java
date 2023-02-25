package com.BikkatIt.UserManagementApp.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurity {
	@Bean
	public InMemoryUserDetailsManager userDetailsService(PasswordEncoder encoder) {

		UserDetails admin = User.withUsername("chandrima").password(encoder.encode("chandrima")).roles("admin").build();
		System.out.println("admin password" + admin.getPassword());

	
		return new InMemoryUserDetailsManager(admin);
	}
	@Bean
	public PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		return http.csrf().disable().authorizeHttpRequests().antMatchers("/home").permitAll().and()
				.authorizeHttpRequests().antMatchers("/contact").authenticated().and().formLogin().and().build();

	}

}
