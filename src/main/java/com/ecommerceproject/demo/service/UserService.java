package com.ecommerceproject.demo.service;

import java.util.Map;
import java.util.Optional;

import com.ecommerceproject.demo.dto.LocalUser;
import com.ecommerceproject.demo.dto.SignUpRequest;
import com.ecommerceproject.demo.exception.UserAlreadyExistAuthenticationException;
import com.ecommerceproject.demo.model.User;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

/**
 * @author Rx
 * @since 08/2/22
 */
public interface UserService {

    public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;
    User findUserByEmail(String email);
    Optional<User> findUserById(Long id);

    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}