package l21_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PokemonTest {

    @Test
    public void testPokemonConstructor() {
        String name = "Eugeny";
        int age = 45;

        Pokemon pokemon = new Pokemon(name, age);

        Assertions.assertEquals("Mike", pokemon.name, "Имя некорректное!");
        Assertions.assertEquals(age, pokemon.age);
    }
}
