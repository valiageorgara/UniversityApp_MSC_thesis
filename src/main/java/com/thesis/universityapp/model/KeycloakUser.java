package com.thesis.universityapp.model;
import javax.persistence.*;
@Entity
@Table(name = "user_entity")
public class KeycloakUser {

    @Id
    private String id;

    private String email;

    private String email_constraint;

    private boolean email_verified;

    private boolean enabled;

    private String federation_link;

    private String first_name;

    private String last_name;

    private String realm_id;

    private String username;

    private Long created_timestamp;

    private String service_account_client_link;

    private Long not_before;

    public KeycloakUser() {
        // blind constructor
    }

    public KeycloakUser(String id, String email, String email_constraint, boolean email_verified, boolean enabled, String federation_link, String first_name, String last_name, String realm_id, String username, Long created_timestamp, String service_account_client_link, Long not_before) {
        this.id = id;
        this.email = email;
        this.email_constraint = email_constraint;
        this.email_verified = email_verified;
        this.enabled = enabled;
        this.federation_link = federation_link;
        this.first_name = first_name;
        this.last_name = last_name;
        this.realm_id = realm_id;
        this.username = username;
        this.created_timestamp = created_timestamp;
        this.service_account_client_link = service_account_client_link;
        this.not_before = not_before;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_constraint() {
        return email_constraint;
    }

    public void setEmail_constraint(String email_constraint) {
        this.email_constraint = email_constraint;
    }

    public boolean isEmail_verified() {
        return email_verified;
    }

    public void setEmail_verified(boolean email_verified) {
        this.email_verified = email_verified;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getFederation_link() {
        return federation_link;
    }

    public void setFederation_link(String federation_link) {
        this.federation_link = federation_link;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRealm_id() {
        return realm_id;
    }

    public void setRealm_id(String realm_id) {
        this.realm_id = realm_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(Long created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public String getService_account_client_link() {
        return service_account_client_link;
    }

    public void setService_account_client_link(String service_account_client_link) {
        this.service_account_client_link = service_account_client_link;
    }

    public Long getNot_before() {
        return not_before;
    }

    public void setNot_before(Long not_before) {
        this.not_before = not_before;
    }
}