

import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;


import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionParameterizedTest {

    @Mock
    private Predator mockPredator;

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void testManeParameterized(String sex, boolean expectedMane) throws Exception {
        Lion lion = new Lion(sex, (Feline) mockPredator);
        assertEquals(expectedMane, lion.doesHaveMane());
    }
}