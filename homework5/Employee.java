package ru.geekbrains.homework5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int pay;
    private int age;

    public Employee(String name, String position, String email, String phone, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void Info(){
        System.out.println("Name: "+ name+ " position: " + position+ " e-mail: " + email + " phone: " + phone + " pay: " + pay + " age: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length()==5){
            this.phone = phone;
        } else System.out.println("Uncorrect Phone");
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
