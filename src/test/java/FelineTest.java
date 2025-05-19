

import com.example.Feline;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FelineTest {
    private final Feline feline = new Feline();

    @Test
    void testGetFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood());
    }

    @Test
    void testGetKittens() {
        assertEquals(1, feline.getKittens());
    }
}