package models;

import util.ReadCredentialsWeb;

public class Credentials {

    private String userWeb;
    private String passWeb;
    private String serialToken;
    private String token;
    private String token1;
    private String token2;
    private String token3;
    private String token4;
    private String token5;
    private String token6;

    public Credentials() {
        userWeb = ReadCredentialsWeb.with("userWeb");
        passWeb = ReadCredentialsWeb.with("passWeb");
    }

    public String getUserWeb() {
        return userWeb;
    }

    public String getPassWeb() {
        return passWeb;
    }

    public static Credentials init() {
        return new Credentials();
    }
}
