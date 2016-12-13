package com.bjc.protoss.dp.module.template.wesley.impl;

import com.bjc.protoss.dp.module.template.wesley.Authorization;

public class OAuth implements Authorization {

	@Override
	public boolean authorize(String token) {
		System.out.println("OAuth process.");
		return (token!=null)?true:false;
	}

}
