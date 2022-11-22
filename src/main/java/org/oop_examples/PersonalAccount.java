package org.oop_examples;

//пример наследования: класс Personal_account является наследником класса User_account (см. слово extends)
public class PersonalAccount extends UserAccount {

    // пример перегрузки метода - меняем количество параметров
    public void setAccount_type() {
        this.account_type = "personal_account";
    }

    // пример переопределения - меняем содержание метода
    @Override
    public void fillAccountInfo(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        setAccount_type();
        System.out.println("You registered a new account:");
        System.out.println(name + " " + surname + ", email and pass: " + email + " | " + password);
        System.out.println("account type: " + account_type);
    }

}
