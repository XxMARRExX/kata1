package model.kata1.software.ulpgc.es;

public class Player {

    private String name;
    private int age;
    private String position;
    private String team;

    public Player(String name, int age, String position, String team) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
