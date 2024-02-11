package laskin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static junit.framework.TestCase.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LaskinTest {

    private Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeEach
    public void clearCalculator() {
        laskin.nollaa();
    }

    @Test
    public void testLisaa() {
        laskin.lisaa(1);
        laskin.lisaa(2);
        assertEquals(3, laskin.annaTulos(), DELTA, "Lukujen 1 ja 2 summa väärin"); // Muokattu odotettu tulos
    }

    @Test
    public void testVahenna() {
        laskin.lisaa(10);
        laskin.vahenna(2);
        assertEquals(8, laskin.annaTulos(), DELTA, "Lukujen 10 ja 2 erotus väärin"); // Muokattu odotettu tulos
    }

    @Test
    @DisplayName("Testaa jakolasku 8 / 2")
    public void testJaa() {
        laskin.lisaa(8);
        laskin.jaa(2);
        assertEquals(4, laskin.annaTulos(), DELTA, "Jakolasku 8/2 väärin"); // Muokattu odotettu tulos
    }

    @Test
    @DisplayName("Testaa nollallajako")
    public void testJaaNollalla() {
        IllegalArgumentException poikkeus = assertThrows(IllegalArgumentException.class, () -> laskin.jaa(0));
        assertEquals("Nollalla ei voi jakaa", poikkeus.getMessage());
    }

    @Test
    public void testKerro() {
        laskin.lisaa(5);
        laskin.kerro(3);
        assertEquals(15, laskin.annaTulos(), DELTA, "Lukujen 5 ja 3 tulo väärin");
    }
}
