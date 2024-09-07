import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatSayMeowTest {

    @Spy
    Cat cat = new Cat(new Feline());

    @Test
    public void testCatSayMeow() {
        String sound = cat.getSound();
        Assert.assertEquals("Мяу", sound);
    }
}
