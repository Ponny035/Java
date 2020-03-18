import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OCGameTest {
    @Test
    void output() {
        OCGame test = new OCGame();
        assertEquals("oo", test.testOutput(2));
        assertEquals("cc", test.testOutput(0));
        String temp = test.testOutput(1);
        assertTrue(((temp.equals("oc"))||(temp.equals("co"))));
    }
    @Test
    void valYN() {
        OCGame test = new OCGame();
        assertTrue(test.testValYN("Y"));
        assertFalse(test.testValYN("N"));
        assertTrue(test.testValYN("y"));
        assertFalse(test.testValYN("n"));
        assertFalse(test.testValYN("Hello World"));
        assertFalse(test.testValYN("o"));
        assertFalse(test.testValYN(""));
    }

    @Test
    void valInputPredictor() {
        OCGame test = new OCGame();
        int turn = 0;
        int[] inputConvert = test.testValInput(turn,"OO2");
        assertTrue(inputConvert[0]==2 && inputConvert[1]==2 && inputConvert[2]==1);
        inputConvert = test.testValInput(turn,"Oc1");
        assertTrue(inputConvert[0]==1 && inputConvert[1]==1 && inputConvert[2]==1);
        inputConvert = test.testValInput(turn,"co0");
        assertTrue(inputConvert[0]==1 && inputConvert[1]==0 && inputConvert[2]==1);
        inputConvert = test.testValInput(turn,"cC4");
        assertTrue(inputConvert[0]==0 && inputConvert[1]==4 && inputConvert[2]==1);
        inputConvert = test.testValInput(turn,"oo3");
        assertTrue(inputConvert[0]==2 && inputConvert[1]==3 && inputConvert[2]==1);
        inputConvert = test.testValInput(turn,"cc55");
        assertTrue(inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"c55");
        assertTrue( inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"cc");
        assertTrue( inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"co");
        assertTrue( inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"oc");
        assertTrue( inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"oo");
        assertTrue( inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"00");
        assertTrue( inputConvert[2]==0);
    }

    @Test
    void valInputNotPredictor() {
        OCGame test = new OCGame();
        int turn = 1;
        int[] inputConvert = test.testValInput(turn,"OO2");
        assertTrue(inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"Oc1");
        assertTrue(inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"co0");
        assertTrue(inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"cC4");
        assertTrue(inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"oo3");
        assertTrue(inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"cc55");
        assertTrue(inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"c55");
        assertTrue( inputConvert[2]==0);
        inputConvert = test.testValInput(turn,"cc");
        assertTrue( inputConvert[0]==0 && inputConvert[1]==0 && inputConvert[2]==1);
        inputConvert = test.testValInput(turn,"co");
        assertTrue( inputConvert[0]==1 && inputConvert[1]==0 && inputConvert[2]==1);
        inputConvert = test.testValInput(turn,"oc");
        assertTrue( inputConvert[0]==1 && inputConvert[1]==0 && inputConvert[2]==1);
        inputConvert = test.testValInput(turn,"oo");
        assertTrue( inputConvert[0]==2 && inputConvert[1]==0 && inputConvert[2]==1);
        inputConvert = test.testValInput(turn,"00");
        assertTrue( inputConvert[2]==0);
    }

    @Test
    void CheckWin () {
        OCGame test = new OCGame();
        int turn = 0;
        assertTrue(test.testCheckWin(turn,2,2,4));
        assertTrue(test.testCheckWin(turn,1,2,3));
        assertFalse(test.testCheckWin(turn,1,2,0));
        turn = 1;
        assertTrue(test.testCheckWin(turn,2,2,4));
        assertTrue(test.testCheckWin(turn,1,2,3));
        assertFalse(test.testCheckWin(turn,1,2,0));
    }

}