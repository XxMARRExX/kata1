package model.kata1.software.ulpgc.es;

public class Coach {

    private String name;
    private int age;
    private String experience;

    public Coach(String name, int age, String experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getExperience() {
        return experience;
    }
}
