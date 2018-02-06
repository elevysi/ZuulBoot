package com.elevysi.site.zuul.util;

import org.springframework.stereotype.Component;

@Component
public class UserContext {
	public static final String CORRELATION_ID = "elevysi-correlation-id";
	public static final String AUTH_TOKEN = "elevysi-auth-token";
	public static final String USER_ID = "elevysi-user-id";
	public static final String PROFILE_ID = "elevysi-profile-id";
	
	private String correlationId = new String();
    private String authToken = new String();
    private String userId = new String();
    private String profileId = new String();
	
    public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
    
    
}
