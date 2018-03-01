package com.idark.config.redis;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * @author guoyakui
 * @date created in 17:45 2017/12/8
 */
public class SessionInitializer  extends AbstractHttpSessionApplicationInitializer {
    public SessionInitializer() {
        super(SessionConfig.class);
    }
}
