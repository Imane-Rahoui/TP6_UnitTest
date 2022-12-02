import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import principa.CompteEpargne;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CompteEpargneTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test BDAA");
    }

    @AfterEach
    void tearDown() {
        System.out.println("BYE");
    }

    @org.junit.jupiter.api.Test
    void retirer() {
        System.out.println("-------RETIRER-------");
        CompteEpargne ce=new CompteEpargne("Imane",99+new Random().nextInt(),101);
        // System.out.println(ce.getSolde());
        assertEquals(100.0,ce.retirer(1));

    }

    @org.junit.jupiter.api.Test
    void deposer() {
        System.out.println("-------DEPOSER-------");
        CompteEpargne ce=new CompteEpargne("Imane",99+new Random().nextInt(),100);
        System.out.println(ce.getSolde());
        assertEquals(101,ce.deposer(1));
    }

    @org.junit.jupiter.api.Test
    void getSolde() {
        System.out.println("-------GET SOLDE-------");
        CompteEpargne ce=new CompteEpargne("Imane",99+new Random().nextInt(),100);
        assertEquals(100,ce.getSolde());

    }

    @org.junit.jupiter.api.Test
    void testUni() {
        System.out.println("-------ANOTHER TESTS-------");

        int t1[]={1,2,3,4};
        int t2[]={1,2,3,4};

        assertArrayEquals(t1,t2);
    }
}