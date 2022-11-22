package org.oop_examples;

//пример абстракции: абстрактный класс User_account, поля и методы которого унаследуют другие классы
//тут прописаны поля и методы, которые будут нужны каждому подклассу
public abstract class UserAccount {
    public String name;
    public String surname;
    public String email;
    public String password;
    public String account_type;

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public void fillAccountInfo(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        //System.out.println("You registered a new account:");
        //System.out.println(name + " " + surname + ", email and pass: " + email + "|" + password);
    }

}
