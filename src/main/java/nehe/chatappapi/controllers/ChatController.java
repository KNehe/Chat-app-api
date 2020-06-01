package nehe.chatappapi.controllers;


import nehe.chatappapi.Services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/")
public class ChatController {

    private ChatService chatService;

    @Autowired
    public  ChatController(ChatService chatService){
        this.chatService = chatService;
    }

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers(){

        return  ResponseEntity.ok(chatService.getAllUsers());
    }
}
