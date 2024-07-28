package com.games.thirdworld.common.security;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.games.thirdworld.common.security.filter.UsernamePasswordAuthenticationFilter;
// import lombok.RequiredArgsConstructor;
// import org.springframework.context.annotation.Bean;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.logout.LogoutFilter;
// import org.springframework.web.cors.CorsConfiguration;
//
// import java.util.Arrays;
// import java.util.Collections;

// @EnableWebSecurity
// @RequiredArgsConstructor
public class SecurityConfig {

    // private final ObjectMapper objectMapper;
    //
    // @Bean
    // public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    //
    //     http
    //             .cors(cors -> cors.configurationSource(request -> corsFilter()))
    //             .csrf(AbstractHttpConfigurer::disable)
    //             .formLogin(AbstractHttpConfigurer::disable)
    //             .httpBasic(AbstractHttpConfigurer::disable)
    //             .logout(AbstractHttpConfigurer::disable)
    //             .sessionManagement(c -> c.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
    //             .authorizeHttpRequests((request) -> {
    //                 request.requestMatchers("/auth/**").permitAll();
    //                 request.requestMatchers("/auth/login", "/auth/join").permitAll();
    //                 request.anyRequest().authenticated();
    //             });
    //
    //     // http
    //     //         .addFilterAfter(usernamePasswordAuthenticationFilter(), LogoutFilter.class);
    //
    //     return http.build();
    // }
    //
    // @Bean
    // public CorsConfiguration corsFilter() {
    //     CorsConfiguration config = new CorsConfiguration();
    //     config.setAllowedOrigins(Arrays.asList(
    //             "http://localhost:3000", "http://localhost:3001"
    //     ));
    //     config.setAllowedMethods(Collections.singletonList("*"));
    //     config.setAllowCredentials(true);
    //     config.setAllowedHeaders(Collections.singletonList("*"));
    //     config.setExposedHeaders(Arrays.asList("Authorization", "Set-Cookie"));
    //     config.setMaxAge(3600L);
    //     return config;
    // }
    //
    // @Bean
    // public UsernamePasswordAuthenticationFilter usernamePasswordAuthenticationFilter() throws Exception{
    //     UsernamePasswordAuthenticationFilter usernamePasswordAuthenticationFilter = new UsernamePasswordAuthenticationFilter(objectMapper);
    //     // usernamePasswordAuthenticationFilter.setAuthenticationManager(authenticationManager());
    //     // usernamePasswordAuthenticationFilter.setAuthenticationSuccessHandler(signInSuccessHandler());
    //     // usernamePasswordAuthenticationFilter.setAuthenticationFailureHandler(signInFailureHandler());
    //     return usernamePasswordAuthenticationFilter;
    // }

}
