package fr.parisnanterre;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppTest {

    @Test
    void testMain() {
        // Checks that the main method doesn't throw an exception
        assertDoesNotThrow(() -> App.main(new String[] {}));
    }
}