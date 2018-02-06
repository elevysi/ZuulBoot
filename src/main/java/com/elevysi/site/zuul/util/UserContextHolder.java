package com.elevysi.site.zuul.util;

import org.springframework.util.Assert;

public class UserContextHolder {
	
	private static final ThreadLocal<UserContext> userContext = new ThreadLocal<UserContext>();
	
	public static final UserContext getContex(){
		UserContext context = userContext.get();
		
		if(context == null){
			context = createEmptyContext();
			userContext.set(context);
		}
		
		return userContext.get();
	}
	
	public static final void setUsercontext(UserContext context) {
		Assert.notNull(context, "Only non-null UserContext instances are permitted");
		userContext.set(context);
	}
	
	public static final UserContext createEmptyContext(){
		return new UserContext();
	}
	
	
}
