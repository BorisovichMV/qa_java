import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineEatMeatTest {

    @Mock
    Feline feline;

    @Test
    public void testFelineEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
    }
}
