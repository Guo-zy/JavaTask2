package model;

public class animal {
    public String name;
    public Integer age;
    public Integer weight;

    public animal(String name, Integer age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void running(){
        System.out.println(this.name + "running");
    }
    public void eating(){
        System.out.println(this.name + "eating");
    }
}