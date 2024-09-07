import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetFoodTest {

    @Spy
    Feline feline;

    @Test
    public void testFelineGetFood() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).getFood(Mockito.anyString());
    }
}
