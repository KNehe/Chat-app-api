package nehe.chatappapi.Modals;

import java.io.Serializable;

public class RegisterResponse implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;

	private final String jwtToken;
	private final Object object;

	public RegisterResponse(String jwtToken, Object object) {
		this.jwtToken = jwtToken;
		this.object = object;
	}

}