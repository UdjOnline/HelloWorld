package l24_object_string.people;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PeopleTest {
    private People person1;
    private People person2;
    private People person3;

    @BeforeEach // запускается перед каждым тейст-кейсом, не статический, имеет доступ к this
    public void setUp() {
        this.person1 = new People("man", "Evgeny", 20, 72);
        this.person2 = new People("man", "Evgeny", 20, 72);
        this.person3 = new People("man", "Evgeny", 20, 72);
    }

    @Test
    public void testHash() {
        Assertions.assertTrue(person1.hashCode() == person2.hashCode());
    }
}