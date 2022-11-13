package com.heliocc.config.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class AuthInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return checkAuth(request, response, handler);
    }

    private boolean checkAuth(HttpServletRequest request, HttpServletResponse response, Object handler) {
        log.info("认证授权检查");
        return true;
    }
}
