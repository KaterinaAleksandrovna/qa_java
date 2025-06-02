import com.example.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {
    @Mock
    private Feline mockPredator;

    @Test
    void testMaleHasMane() throws Exception {
        Lion lion = new Lion("Самец", (Feline) mockPredator);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    void testFemaleHasNoMane() throws Exception {
        Lion lion = new Lion("Самка", (Feline) mockPredator);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", (Feline) mockPredator);
        when(mockPredator.getFood()).thenReturn(List.of("Мясо", "Птица"));
        assertEquals(List.of("Мясо", "Птица"), lion.getFood());
        verify(mockPredator, times(1)).getFood();
    }

    @Test
    void testGetKittens() throws Exception {
        Lion lion = new Lion("Самка", (Feline) mockPredator);
        when(mockPredator.getKittens()).thenReturn(3);
        assertEquals(3, lion.getKittens());
        verify(mockPredator, times(1)).getKittens();
    }

    @Test
    void testInvalidSexThrowsException() {
        Exception exception = assertThrows(Exception.class,
                () -> new Lion("Неизвестно", mockPredator));
        assertEquals("Используйте допустимые значения пола", exception.getMessage());
    }

    @Test
    void testGetFoodPropagatesException() throws Exception {
        Lion lion = new Lion("Самец", mockPredator);
        when(mockPredator.getFood()).thenThrow(new Exception("Ошибка получения еды"));
        Exception exception = assertThrows(Exception.class, lion::getFood);
        assertEquals("Ошибка получения еды", exception.getMessage());
    }
}