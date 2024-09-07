import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineFamilyTest {

    @Spy
    Feline feline;

    @Test
    public void testFelineFamily() {
        String family = feline.getFamily();
        Mockito.verify(feline).getFamily();
        Assert.assertEquals("Кошачьи", family);
    }
}
