package com.codershop.shoppinganywhere.model;


public class Administrator {
    private Integer id_admin;
    private String userName;
    private String password;

    public Administrator(Integer id_admin, String userName, String password) {
        this.id_admin = id_admin;
        this.userName = userName;
        this.password = password;
    }
    public Administrator() {

    }


    public Integer getId_admin() {
        return id_admin;
    }

    public void setId_admin(Integer id_admin) {
        this.id_admin = id_admin;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
