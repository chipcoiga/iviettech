package com.example.springmvcshopingcart.util;

import com.example.springmvcshopingcart.security.UserPrincipal;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collection;
import java.util.List;

public class SecurityUtil {
    public static UserPrincipal currentUser() {
        return (UserPrincipal) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
    }

    public static Collection<? extends GrantedAuthority> getCurrentRole() {
        return SecurityContextHolder.getContext().getAuthentication().getAuthorities();
    }

    public static boolean isAuthenticated() {
        return SecurityContextHolder.getContext().getAuthentication().isAuthenticated();
    }
}
