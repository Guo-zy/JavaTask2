package model;

public class Felidae extends animal{


    public Felidae(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }

    public void unique(){
        System.out.println(this.name + "产生独特的喵鸣声");
    }
}
