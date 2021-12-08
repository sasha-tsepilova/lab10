package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    @BeforeEach
    void setUp() {
        user = User.builder()
                .firstName("Sasha")
                .weight(1000)
                .age(18)
                .lastname("Tsepilova")
                .occupation("Student")
                .build();
    }

    @Test
    void testToString() {
        assertEquals(user.toString(), "User(firstName=Sasha, lastname=Tsepilova, occupations=[Student], age=18, weight=1000)");
    }
}