import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetSoundFromCatTest {

    @Mock
    Cat cat;

    @Test
    public void testGetSoundFromCat() {
        cat.getSound();
        Mockito.verify(cat).getSound();
    }
}
