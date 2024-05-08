package tick.banque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import tick.banque.models.Agent;
import tick.banque.interfaces.AgentInterface;
import java.util.Collections;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private AgentInterface agentRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Agent agent = agentRepository.findByUsername(username).orElseThrow(() ->
                new UsernameNotFoundException("User not found with username: " + username));

        List<SimpleGrantedAuthority> authorities;
        switch (agent.getRole()) {
            case "ROLE_ADMIN":
                authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"));
                break;
            case "ROLE_CLIENT":
                authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_CLIENT"));
                break;
            case "ROLE_AGENT":
                authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_AGENT"));
                break;
            default:
                throw new UsernameNotFoundException("Role not supported for the user: " + username);
        }

        return new org.springframework.security.core.userdetails.User(
                agent.getUsername(),
                agent.getPassword(),
                authorities
        );
    }
}
