package com.Sercurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;  // use with Lambda DHL version

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)// enables @PreAuthorize
public class SecurityConfig {

    @Bean
     SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Lambda DHL version
    	http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(requests -> requests
                .anyRequest().authenticated())
                .formLogin(withDefaults());  // Enables /login page
        return http.build();
        
        // Classic DSL version
        // Use below code also but it is deprecated in Above 3+ version
//        http
	//        .csrf().disable()
	//        .authorizeHttpRequests()
	//        .anyRequest().authenticated()
	//        .and()
	//        .formLogin();  // Enables /login page
//        return http.build();
    }

    @Bean
    UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {

        UserDetails user = User.withUsername("user")
            .password(passwordEncoder.encode("9870"))
            .roles("USER")
            .build();

        UserDetails admin = User.withUsername("admin")
            .password(passwordEncoder.encode("8736"))
            .roles("ADMIN")
            .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder();
    }
}
