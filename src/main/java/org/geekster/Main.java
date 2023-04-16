package org.geekster;

public class Main {

    public static void main(String args[]){
        //Prepare to send Email
        System.out.println("This application is supposed to send mail");

        HandleMail mailer = new HandleMail();
        mailer.sendMail();
    }

}
