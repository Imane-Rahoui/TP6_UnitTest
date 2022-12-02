import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import principa.CompteEpargne;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CompteEpargneTest {

    // @BeforeEach : qbl matexe kat init bhal creation compte => setup
    // @BeforeAll : exp creation de connexion method kate => setup
    // @AfterEach : mn mora test d method la brit nbdl => tearDown
    // @AfterAll : drt gae test brit nsd files ula bd => tearDownAll

    @BeforeEach
    void setUp() {
        System.out.println("Test BDAA");
    }

    @AfterEach
    void tearDown() {
        System.out.println("BYE");
    }

    static int i=0;
    @org.junit.jupiter.api.Test
    @Order(3)
    void retirer() {
        System.out.println("-------RETIRER-------");
        CompteEpargne ce=new CompteEpargne("Imane",99+new Random().nextInt(),101);
        // System.out.println(ce.getSolde());
        assertEquals(100.0,ce.retirer(1));
        i++;
        System.out.println("number : "+i);
    }

    @org.junit.jupiter.api.Test
    @Order(1)
    void deposer() {
        System.out.println("-------DEPOSER-------");
        CompteEpargne ce=new CompteEpargne("Imane",99+new Random().nextInt(),100);
        System.out.println(ce.getSolde());
        assertEquals(101,ce.deposer(1));
        i++;
        System.out.println("number : "+i);
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void getSolde() {
        System.out.println("-------GET SOLDE-------");
        CompteEpargne ce=new CompteEpargne("Imane",99+new Random().nextInt(),100);
        assertEquals(100,ce.getSolde());
        i++;
        System.out.println("number : "+i);
    }

    @org.junit.jupiter.api.Test
    @Order(4)
    void testUni() {
        System.out.println("-------ANOTHER TESTS-------");

        int t1[]={1,2,3,4};
        int t2[]={1,2,3,4};

        assertArrayEquals(t1,t2);
        i++;
        System.out.println("number : "+i);

    }
}