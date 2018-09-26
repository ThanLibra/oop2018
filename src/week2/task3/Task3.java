package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Dog {

    private int age;
    private int id;
    private String name;

    public Dog() {
        this.age = 0;
        this.name = "Dog";
        this.id = 0;
    }

    public Dog(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printIdNameAge() {
        return "name : " + this.name + "\nID : " + String.valueOf(this.id).toString() + "\nAge : " + String.valueOf(this.age).toString();
    }

}

class Cat {

    private int age;
    private int id;
    private String name;

    public Cat() {
        this.age = 0;
        this.name = "Dog";
        this.id = 0;
    }

    public Cat(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printIdNameAge() {
        return "name : " + this.name + "\nID : " + String.valueOf(this.id).toString() + "\nAge : " + String.valueOf(this.age).toString();
    }

}

class Baby {

    private int age;
    private int id;
    private String name;

    public Baby() {
        this.age = 0;
        this.name = "Dog";
        this.id = 0;
    }

    public Baby(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printIdNameAge() {
        return "name : " + this.name + "\nID : " + String.valueOf(this.id).toString() + "\nAge : " + String.valueOf(this.age).toString();
    }

}

