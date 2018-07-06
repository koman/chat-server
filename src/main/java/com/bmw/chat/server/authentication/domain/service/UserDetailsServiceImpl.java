package com.bmw.chat.server.authentication.domain.service;

//@Service
public class UserDetailsServiceImpl /*implements UserDetailsService*/{
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findOne(username);
//
//        if (user == null) {
//        	throw new UsernameNotFoundException("User not found");
//        } else {
//        	Set<SimpleGrantedAuthority> grantedAuthorities = user.getRoles().stream()
//        	  .map(role -> new SimpleGrantedAuthority(role.getName()))
//        	  .collect(Collectors.toSet());
//
//	        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
//        }
//    }
}
