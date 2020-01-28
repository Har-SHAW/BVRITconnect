package com.bvrit.bvritconnect.message.request;

import javax.validation.constraints.NotBlank;

public class UserId {
	@NotBlank
    private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
