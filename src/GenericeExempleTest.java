import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GenericeExempleTest {

    @org.junit.jupiter.api.Test
    void maxim() {
        assertEquals(20,GenericeExemple.maxim(10,20));
        assertEquals(2,GenericeExemple.maxim(0,2));
        assertEquals(0,GenericeExemple.maxim(0,-2));
        assertEquals(2,GenericeExemple.maxim(-1,2));
        assertEquals(-1,GenericeExemple.maxim(-1,-2));
    }

    @Test
    void sumaPanaLaN() {
        for (int j = 0; j < 10; j++) {
            Random rand = new Random();
            int n = rand.nextInt(0, 1000);
            int s = 0;
            for (int i = 1; i <= n; i++) {
                s += i;
            }
            assertEquals(s, GenericeExemple.sumaPanaLaN(n));
        }
    }

    @Test
    void sumaLaPatrat() {
        
    }
}