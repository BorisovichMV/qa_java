import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionGetKittensTest {
    private String sex;

    public LionGetKittensTest(String sex){
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                { "Самец" },
                { "Самка" }
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void testLionGetKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getKittens();

        Mockito.verify(feline).getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }
}
