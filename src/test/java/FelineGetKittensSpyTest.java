import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetKittensSpyTest {

    @Spy
    Feline feline;

    @Test
    public void getKittensTest() {
        int kittens = feline.getKittens();
        Mockito.verify(feline).getKittens();
        Mockito.verify(feline).getKittens(Mockito.anyInt());
        Assert.assertEquals(1, kittens);
    }
}
