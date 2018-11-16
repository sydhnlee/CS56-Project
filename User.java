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
    private static final int SEDENTARY = 1;
    private static final int MODERATELY_ACTIVE = 2;
    private static final int VERY_ACTIVE = 3;


    User(String name, int age, int weight, double height, int activity, char gender)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activity = activity;
        this.gender = gender;
        calculateTDEE(age,weight,height,activity,gender);
    }

    void calculateTDEE(int age, int weight, double height, int activity, char gender)
    {
        double w = weight/ 2.20462;
        double cm = 2.54 * height;
        double ree = 0;

if(gender=='M')
{ 
 //10 x weight (kg) + 6.25 x height (cm) – 5 x age (y) + 5 = REE

        ree = (10*w) + (6.25 * cm) - (5 * age) +5;
}
else if(gender =='F')
{
//10 x weight (kg) + 6.25 x height (cm) – 5 x age (y) – 161 = REE
        ree = (10*w) +(6.25*cm)-(5*age)-161;
}
    if(activity == SEDENTARY)
{
        this.tdee = ree * 1.2;
}
    else if(activity == MODERATELY_ACTIVE)
{
     this.tdee = ree*1.55;
}
    else if(activity == VERY_ACTIVE)
{
        this.tdee = ree*1.725;

}
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
