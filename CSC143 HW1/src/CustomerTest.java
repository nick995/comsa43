

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CustomerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CustomerTest
{
    @Test
    /**
     * Testing Customer class's Constrouctor
     *
     * Customer Name, Number, and balance
     *      
     */
   

    public void testFullConstr(){
        Customer myCust = new Customer("Mingyu Jung", "801-413-9704", 200);

        assertEquals("Mingyu Jung"          ,myCust.getCustName());
        assertEquals("801-413-9704", myCust.getCustNumber());
        assertTrue(myCust.getAcctBalanel()==200);
    }
    /*
     * TESTING PRECONDITION OF CUSTOMER
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNamePreCondition(){
        //no spacing First name and Last name
        Customer myCust = new Customer("MingyuJung", "801-413-9704", 200);
        //number in the same
        Customer myCust1 = new Customer("Min 1234", "801-413-9704", 200);
        //If custName is null
        Customer myCust2 = new Customer(null, "801-413-9704", 200);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testNumberPreCondtion(){
        //number without dash
        Customer myCust = new Customer("Mingyu Jung", "8014139704", 200);
        //number with Alphabet
        Customer myCust1 = new Customer("Mingyu Jung", "801asd2222", 200);
        //If custNumber is null
        Customer myCust3 = new Customer("Mingyu Jung", null, 200);
    }

    @Test (expected = IllegalArgumentException.class)
        public void testAccountBalance(){
            // if balance is negative
            Customer myCust = new Customer("Mingyu Jung", "801-413-9704", -1);
            // If balance is zero
            Customer myCust1 = new Customer("Mingyu Jung", "801-413-9704", 0);
        }
    }

