package nehe.chatappapi.Services;

import nehe.chatappapi.Modals.User;
import nehe.chatappapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AuthService {

    private UserRepository userRepository;

    @Autowired
    public  AuthService(UserRepository userRepository){ this.userRepository = userRepository;}

    public User addUser(User user){

      user.setPassword( new BCryptPasswordEncoder().encode( user.getPassword()));

     return userRepository.insert(user);

    }

}
