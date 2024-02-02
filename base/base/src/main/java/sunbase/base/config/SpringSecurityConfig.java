package sunbase.base.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Controller;

@Controller
public class SpringSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return  new BCryptPasswordEncoder();
    }
    @Bean
     public SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
        return security.csrf(csrf->csrf.disable())
                .authorizeHttpRequests(auth-> auth.anyRequest().authenticated())
                .formLogin(login->login.loginPage("/login")
                        .loginProcessingUrl("/login")
                        .defaultSuccessUrl("/customers")
                        .permitAll())
                .logout(logout->logout.logoutRequestMatcher(new AntPathRequestMatcher("/logout")))
                .build();
    }


    @Bean
     public UserDetailsService userDetailsService()
    {
        UserDetails user= User.builder()
                .username("test@sunbasedata.com")
                .password(passwordEncoder().encode("Test@123"))
                .roles("Test@123")
                .build();

        UserDetails admin=User.builder()
                .username("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();
        return  new InMemoryUserDetailsManager(user,admin);
    }


}
