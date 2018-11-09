package sample;

public class User {
    String name;
    int age;
    int weight;
    double height;
    int activity;
    char gender;
    double tdee;
    int fat;
    int protein;
    int carbs;


    User(String name, int age, int weight, double height, int activity, char gender)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activity = activity;
        this.gender = gender;
    }

    void calculateTDEE(int age, int weight, double height, int activity, char gender)
    {

    }

    void calculateMacros(double tdee)
    {

    }

    int getWeight()
    {
        return weight;
    }

    void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "\n" + age + "\n" + weight + "\n" + height + "\n" + activity + "\n" + gender;
    }
}
