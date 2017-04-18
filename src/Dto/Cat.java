package Dto;

/**
 * Created by MartynasV on 2017-04-18.
 */
public class Cat {
    private String name;
    private String kind;
    private int age;
    private double weight;
    private boolean LikeMilk;

    public Cat(String name, String kind, int age, double weight, boolean isLikeMilk) {
        this.name = name;
        this.kind = kind;
        this.age = age;
        this.weight = weight;
        this.LikeMilk = LikeMilk;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isLikeMilk() {
        return LikeMilk;
    }
}
