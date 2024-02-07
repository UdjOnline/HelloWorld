class Pokemon {
    String namePokemon; //имя покемона
    int HP; //очки здровья
    int attack; //атака
    int defense; //защита
    int specialAttack; //специальная атака
    int specialDefence; //специальная защита
    int speed; //скорость

    // Создаем конструктор
    Pokemon(String namePokemon, int HP, int attack, int defense, int specialAttack, int specialDefence, int speed) {
        this.namePokemon = namePokemon;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefence = specialDefence;
        this.speed = speed;
    }

    public void fightPokemon() {
        System.out.println(namePokemon + " дерётся!");
    }

    public void sleepPokemon() {
        System.out.println(namePokemon + " спит!");
    }
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon Minccino = new Pokemon("Minccino", 15, 20,15, 10, 12, 30);
        Pokemon Cosnoen = new Pokemon("Cosnoen", 16, 21, 16, 11, 13, 35);

        System.out.println("Minccino просим драться:");
        Minccino.fightPokemon();

        System.out.println("Cosnoen просим драться:");
        Cosnoen.fightPokemon();

        System.out.println("Просим покемонов спать:");
        Minccino.sleepPokemon();
        Cosnoen.sleepPokemon();
    }
}
