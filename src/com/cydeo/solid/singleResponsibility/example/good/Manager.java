package com.cydeo.solid.singleResponsibility.example.good;

public class Manager {

    public static boolean validate() {
        boolean flag = false;
        // Implementation for validation.
        return flag;
    }

    public static boolean checkSecurity() {
        return SecurityFilter.authenticate() && SecurityFilter.authorize();
    }

}
