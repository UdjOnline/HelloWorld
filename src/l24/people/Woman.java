package l24.people;

public class Woman extends People {

    public Woman(String name, int age, int weight){
        super("Woman", name, age, weight);
    }

    public void applySkill() {
        super.applySkill();
        System.out.println("Зато я в совершенствии знаю английский!");
    }
}
