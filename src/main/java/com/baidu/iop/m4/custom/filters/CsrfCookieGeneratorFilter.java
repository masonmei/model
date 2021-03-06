package com.baidu.iop.m4.custom.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Filter used to put the CSRF token generated by Spring Security in a cookie for use by AngularJS.
 *
 * @author mason
 */
public class CsrfCookieGeneratorFilter extends OncePerRequestFilter {
    private static final Logger LOG = LoggerFactory.getLogger(CsrfCookieGeneratorFilter.class);

    private static final String CSRF_COOKIE_NAME = "M4-XSRF-TOKEN";
    private static final String CSRF_HEADER_NAME = "X-M4-SXRF-TOKEN";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // Spring put the CSRF token in session attribute "_csrf"
        CsrfToken csrfToken = (CsrfToken) request.getAttribute("_csrf");

        // Send the cookie only if the token has changed
        String actualToken = request.getHeader(CSRF_HEADER_NAME);
        if (actualToken == null || !actualToken.equals(csrfToken.getToken())) {
            Cookie cookie = new Cookie(CSRF_COOKIE_NAME, csrfToken.getToken());
            cookie.setMaxAge(-1);
            cookie.setHttpOnly(false);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
        filterChain.doFilter(request, response);
    }
}
