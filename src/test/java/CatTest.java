

import com.example.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class CatTest {
    @Mock
    private Feline mockFeline;

    @Test
    void testGetSound() {
        Cat cat = new Cat(mockFeline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void testGetFood() throws Exception {
        Cat cat = new Cat(mockFeline);
        when(mockFeline.getFood()).thenReturn(List.of("Рыба"));
        assertEquals(List.of("Рыба"), cat.getFood());
    }
}