package l16_oop2;

class Pokemon {
    String namePokemon; //имя покемона
    int HP; //очки здровья
    int attack; //атака
    int defense; //защита
    int specialAttack; //специальная атака
    int specialDefence; //специальная защита
    int speed; //скорость
    int currentHP; //текущие очки здоровья

    // Создаем конструктор
    Pokemon(String namePokemon, int HP, int attack, int defense, int specialAttack, int specialDefence, int speed, int currentHP) {
        this.namePokemon = namePokemon;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefence = specialDefence;
        this.speed = speed;
        this.currentHP = currentHP;
    }

    public void fightPokemon() {
        System.out.println(namePokemon + " дерётся!");
    }

    public void sleepPokemon() {
        System.out.println(namePokemon + " спит!");
    }

    public void sleepOnePokemon () {
        int maxHP = 120;
        if (currentHP < maxHP / 10) {
            System.out.println(namePokemon + " идёт спать");
            currentHP += maxHP / 10;
        } else {
            System.out.println(namePokemon + " не хочет спать");
        }
    }
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon Minccino = new Pokemon("Minccino", 15, 20,15, 10, 12, 30, 20);
        Pokemon Cosnoen = new Pokemon("Cosnoen", 16, 21, 16, 11, 13, 35, 11);

        System.out.println("Minccino просим драться:");
        Minccino.fightPokemon();

        System.out.println("Cosnoen просим драться:");
        Cosnoen.fightPokemon();

        System.out.println("Просим покемонов спать:");
        Minccino.sleepPokemon();
        Cosnoen.sleepPokemon();

        System.out.println("Просим одного покемона спать:");
        Minccino.sleepOnePokemon();
        Cosnoen.sleepOnePokemon();
    }
}
