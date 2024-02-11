import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorJommiTest {
    StringManipulatorJommi sm = new StringManipulatorJommi();

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    void reverse() {
        assertEquals("tac", sm.reverse("cat"));
    }

    @Test
    void capitalize() {
        assertEquals("CAT", sm.capitalize("cat"));
    }
}