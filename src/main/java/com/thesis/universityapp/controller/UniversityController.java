package com.thesis.universityapp.controller;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/universities/")
public class UniversityController {
    @GetMapping("user-infos")
    public String userInfoController(Principal principal) {

        KeycloakAuthenticationToken keycloakAuthenticationToken = (KeycloakAuthenticationToken) principal;
        AccessToken accessToken = keycloakAuthenticationToken.getAccount().getKeycloakSecurityContext().getToken();
        KeycloakSecurityContext session = ((KeycloakAuthenticationToken) principal).getAccount().getKeycloakSecurityContext();
        System.out.println(accessToken.getPreferredUsername());
        System.out.println(accessToken);
        System.out.println(accessToken.getEmail());
        System.out.println(accessToken.getId());
        System.out.println(accessToken.getFamilyName());
        System.out.println(accessToken.getGivenName());
        System.out.println(accessToken.getIssuer());
        AccessToken.Access realmAccess = accessToken.getRealmAccess();
        System.out.println(realmAccess.getRoles());
        return "ok";
    }

}
