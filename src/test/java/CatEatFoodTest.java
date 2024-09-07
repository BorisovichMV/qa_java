import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatEatFoodTest {

    @Mock
    Cat cat;

    @Test
    public void testCatEatFood() throws Exception {
        cat.getFood();
        Mockito.verify(cat).getFood();
    }
}
