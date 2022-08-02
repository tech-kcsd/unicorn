package kz.kcsd.unicorn.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    STUDENT,
    HR;

    @Override
    public String getAuthority() {
        return name();
    }
}
