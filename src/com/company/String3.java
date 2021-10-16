package com.company;

public class String3 {
    public static void main(String[] args) {

        String name = "John";
        if (name.matches("[a-zA-Z]+")) {
            System.out.println(name + " is valid entry.");
        } else {
            System.out.println("Invalid entry. Only latin letters accepted.");

        }
        String username = "s20surname";
        if (username.matches("[a-zA-Z]{1}[0-9]{2}[a-zA-Z]+")) {
            System.out.println("Username valid.");
        } else {
            System.out.println("Your username can not be validated.");
        }
        String personCodeOfLatvia = "121200-11311";
        if (personCodeOfLatvia.matches("[0-9]{6}[-][0-9]{5}")) {
            System.out.println("Person Code is valid.");
        } else {
            System.out.println("Invalid entry. Only entry '123456-12345' accepted.");

        }
    }
}
