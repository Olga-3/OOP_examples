package org.oop_examples;

import org.w3c.dom.ls.LSOutput;

public class Program extends UserAccount{

    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount();
        account.fillAccountInfo("Vasya", "Pupkin", "vasya@mail.ru", "pass11");

        CompanyAccount account1 = new CompanyAccount();
        account1.fillAccountInfo("Petya", "Smirnov", "Petya@inbox.ru", "petya1987");
    }

}
