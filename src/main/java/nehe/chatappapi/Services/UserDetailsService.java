package nehe.chatappapi.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {


    @Autowired
    public UserDetailsService(){}

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return null;
    }
}
