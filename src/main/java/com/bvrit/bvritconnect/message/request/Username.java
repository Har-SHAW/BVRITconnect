package com.bvrit.bvritconnect.message.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Username {
	@NotBlank
    @Size(min=3, max = 60)
    private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
