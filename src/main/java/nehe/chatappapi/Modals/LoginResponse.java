package nehe.chatappapi.Modals;

import java.io.Serializable;

public class LoginResponse implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private final String jwtToken;

    public LoginResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

}