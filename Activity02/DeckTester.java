package Activity02;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DeckTester.
 *
 * @author  (Rachel Schmeltzer)
 * @version (v1 April/2015)
 */
public class DeckTester
{
    String[] rank1 = {"Jack", "Ace", "King"};
    String[] suit1 = {"Clubs", "Diamonds"};
    int[] value1 = {13, 1, 11};
    String[] rank2 = {"Two", "Four", "Seven", "Ten"};
    String[] suit2 = {"Hearts", "Spades", "Diamonds"};
    int[] value2 = {2, 4, 7, 10};
    String[] rank3 = {"Three", "Five", "Six", "Nine", "Queen"};
    String[] suit3 = {"Diamonds", "Hearts", "Clubs", "Spades"};
    int[] value3 = {3, 5, 6, 9, 12};
    Deck deck1 = new Deck(rank1, suit1, value1);
    Deck deck2 = new Deck(rank2, suit2, value2);
    Deck deck3 = new Deck(rank3, suit3, value3);
    /**
     * Default constructor for test class DeckTester
     */
    public DeckTester()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testIsEmpty()
    {
        assertFalse(deck1.isEmpty());
        assertFalse(deck2.isEmpty());
        assertFalse(deck3.isEmpty());
    }
    
    @Test
    public void testSize()
    {
        assertEquals(6, deck1.size());
        assertEquals(12, deck2.size());
        assertEquals(20, deck3.size());
    }
    
    @Test
    public void testDeal()
    {
        assertEquals("King", deck1.deal().rank());
        assertEquals("Diamonds", deck1.deal().suit());
        assertEquals(13, deck1.deal().pointValue());
    }
}
