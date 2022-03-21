package com.muwaffaq.innopolis.solid.homework;


import java.util.List;

// lab work
// This Class violates all SOLID Principles, fix it in a Logical way
public class Human implements Needs,SayHello,Hobbies,Tax,NickName{

    private String name;
    private String nickname;
    private double salary;
    private List<String> hobbies;

    enum Languages {Arabic, English, Japanese}

    @Override
    public void calculateTax(int percentage) {
        salary = salary * percentage;
    }

    @Override
    public void creatNickName(String postFix) {
        nickname = name.concat(postFix);
    }

    @Override
    public void pray() {
    }

    @Override
    public void playSports() {

    }

    @Override
    public void getMarried() {

    }

    @Override
    public void ownCompany() {

    }

    @Override
    public void becomeEmployee() {

    }

    @Override
   public String sayHello(Human.Languages languages) {
        if (languages == Human.Languages.Arabic)
            return "مرحبا";
        return "Hello";
    }

    @Override
    public int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.sayHello(Languages.Arabic);
    }

}
