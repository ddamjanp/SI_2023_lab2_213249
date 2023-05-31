import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {


    @Test
    void functionEveryBranch() {
        //Throws Exception 2->26
        RuntimeException ex;
        List<User> users = new ArrayList();
        User userFirst;
        String usernameFirst = "damjan";
        String passwordFirst = "password";
        String emailFirst = "damjan@gmail.com";
        userFirst = new User(usernameFirst,passwordFirst,emailFirst);
        users.add(userFirst);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //Passes all Tests, returns true, 21->22;
        User userSecond;
        String usernameForTesting = null;
        String passwordForTesting = "Pass#Word#";
        String emailForTesting =  "marija@gmail.com";
        User userForTesting = new User(null,passwordForTesting,emailForTesting);
        assertEquals(true,SILab2.function(userForTesting,users));

        //Invalid email, returns false
        String usernameForTesting2 = "Marija";
        String passwordForTesting2 = "Passord";
        String emailForTesting2 =  "marija#gmail.com";
        User userForTesting2 = new User(usernameForTesting2,passwordForTesting2,emailForTesting2);
        assertEquals(false,SILab2.function(userForTesting2,users));

        //User already exists, returns false
        String usernameForTesting3=userFirst.getUsername();
        String passwordForTesting3="PassWord";
        String emailForTesting3=userFirst.getEmail();
        User userForTesting3= new User(usernameForTesting3,passwordForTesting3,emailForTesting3);
        assertEquals(false,SILab2.function(userForTesting3,users));

    }
    @Test
    void functionMultipleConditions(){
        //TXX
        RuntimeException ex;
        List<User> users=new ArrayList<>();
        User userForTXXTest=null;
        ex = assertThrows(RuntimeException.class,()->SILab2.function(userForTXXTest,null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //FTX
        User userForFTXTest;
        String usernameFirst = "some";
        String passwordFirst = null;
        String emailFirst = "wrong";
        userForFTXTest = new User(usernameFirst,passwordFirst,emailFirst);
        ex = assertThrows(RuntimeException.class,()->SILab2.function(userForFTXTest,null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //FFT
        User userForFFTTest;
        String usernameSecond = "some";
        String passwordSecond= "thing";
        String emailSecond = null;
        userForFFTTest = new User(usernameSecond,passwordSecond,emailSecond);
        ex = assertThrows(RuntimeException.class,()->SILab2.function(userForFTXTest,null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //FFF
        User userForFFFTest;
        String usernameThird = "some";
        String passwordThird= "thing";
        String emailThird = "null";
        userForFFFTest = new User(usernameThird,passwordThird,emailThird);
        users.add(userForFFFTest);
        String usernameForTesting2 = "Marija";
        String passwordForTesting2 = "Passord";
        String emailForTesting2 =  "marija#gmail.com";
        User userForTesting2 = new User(usernameForTesting2,passwordForTesting2,emailForTesting2);
        assertEquals(false,SILab2.function(userForTesting2,users));





    }
}