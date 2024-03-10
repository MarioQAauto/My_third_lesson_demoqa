import org.junit.jupiter.api.*;
public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll(){
        System.out.println("###  beforeAll()\n");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("###    beforeEach()");
        result = getResult();
    }
    @AfterEach
    void afterEach(){
        System.out.println("###    afterEach()\n");
        result = 0;
    }
    @AfterAll
    static void afterAll(){
        System.out.println("###  afterAll\n");
    }
    @Test
    void firstTest() {
        System.out.println("###    firstTest()");
        Assertions.assertTrue(result > 2);
    }
    @Test
    void secondTest() {
        System.out.println("###    secondTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thridTest() {
        System.out.println("###    thridTest()");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }

}
