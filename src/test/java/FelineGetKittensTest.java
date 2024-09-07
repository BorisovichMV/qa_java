import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetKittensTest {

    @Mock
    Feline feline;

    @Test
    public void testFelineKittens() {
        feline.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testFelineKittensDeeper() {
        Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(10);
        Assert.assertEquals(10, feline.getKittens(2));
    }
}
