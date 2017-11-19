package com.jc.spring.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by chenjunjun on 2017/11/17.
 */
public class MyWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public MyWebApplicationInitializer() {
        super(MyWebSecurityConfig.class);
    }
}