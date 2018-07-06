package com.bmw.chat.server.configuration;

//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig /*extends WebSecurityConfigurerAdapter*/ {
	
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//        http
//	        .csrf().disable()
//	        .formLogin()
//	        	.loginProcessingUrl("/login")
//	        	.loginPage("/")
//	        	.defaultSuccessUrl("/chat")
//	        	.and()
//	        .logout()
//	        	.logoutSuccessUrl("/")
//	        	.and()
//	        .authorizeRequests()
//	        	.antMatchers("/login", "/new-account", "/").permitAll()
//	        	.antMatchers(HttpMethod.POST, "/chatroom").hasRole("ADMIN")
//	        	.anyRequest().authenticated();
//	}
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
//    }
//
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//    }
}
