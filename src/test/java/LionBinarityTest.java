import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionBinarityTest {

    @Mock
    Feline feline;

    @Test
    public void testLionBinarity() {
        // Используем assertThrows для проверки выброса исключения
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Самцамка", feline);
        });

        // Проверяем, что сообщение исключения соответствует ожидаемому
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}
