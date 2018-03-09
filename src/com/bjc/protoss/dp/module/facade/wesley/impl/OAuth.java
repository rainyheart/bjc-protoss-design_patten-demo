package com.bjc.protoss.dp.module.facade.wesley.impl;

import com.bjc.protoss.dp.module.facade.wesley.Authorization;

public class OAuth implements Authorization {

    @Override
    public boolean authorize(String token) {
        System.out.println("OAuth authorization process.");
        return token.equals("valid_token");
    }

}
