import com.example.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LionTest {
    @Mock
    private Predator mockPredator;

    @Test
    void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", mockPredator);
        when(mockPredator.getFood()).thenReturn(List.of("Мясо"));
        assertEquals(List.of("Мясо"), lion.getFood());
    }
    @Test
    void testDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самка", mockPredator);
        assertFalse(lion.doesHaveMane());
    }
}