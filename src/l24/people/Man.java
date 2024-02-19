package l24.people;

public class Man extends People {

    public Man(String name, int age, int weight){
        super("Man", name, age, weight);
    }

    public void likeToWork() {
        System.out.println("Я люблю работать!");
    }

    public void applySkill() {
        likeToWork();
    }
}
