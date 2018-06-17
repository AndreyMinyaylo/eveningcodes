package com.eveningcodes.shop;

public class UserRole {
    private String administrator;
    private String moderator;
    private String user;

    public UserRole(String administrator, String moderator, String user) {
        this.administrator = administrator;
        this.moderator = moderator;
        this.user = user;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getModerator() {
        return moderator;
    }

    public void setModerator(String moderator) {
        this.moderator = moderator;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
