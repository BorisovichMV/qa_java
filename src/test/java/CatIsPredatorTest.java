import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatIsPredatorTest {

    @Spy
    Feline feline;

    @Test
    public void testCatIsPredator() throws Exception {
        Cat cat = new Cat(feline);
        List<String> eat = cat.getFood();
        Assert.assertArrayEquals(List.of("Животные", "Птицы", "Рыба").toArray(), eat.toArray());
    }
}
