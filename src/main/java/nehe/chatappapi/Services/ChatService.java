package nehe.chatappapi.Services;

import nehe.chatappapi.Modals.User;
import nehe.chatappapi.Modals.UserRes;
import nehe.chatappapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ChatService {

    private UserRepository userRepository;

    @Autowired
    public ChatService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserRes> getAllUsers(){

        List<User> users = userRepository.findAll();

        var userRes = new ArrayList<UserRes>();

        users.forEach( user -> {

            var modifiedUser = new UserRes( user.getId(), user.getFirstName() ,
                    user.getLastName(), user.getEmail(), user.getRole());

            userRes.add( modifiedUser);
        });

        return  userRes;

    }
}
