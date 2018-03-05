

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ESLTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ESLTest
{
    Sex sex=Sex.FEMALE;
    Level level = Level.ESL1A;
        ESL testESLStudent = new ESL("985871450", "Min-Gyu", "Jung", sex,
        "03", "25", "1995", level);

        
        
    @Test
    public void testGetLevel(){
        assertEquals(level, testESLStudent.getLevel());
    }
    
    @Test
    public void testGetPrice(){
        assertEquals(25, testESLStudent.getPrice());
    }
    
    // @Test
    // public void testIsFound(){
        // assertEquals(0, testESLStudent.isFound());
    // }
    
    // @Test
    // public void testAddStudent(){
        // assertEquals("985871450", "Min-Gyu", "Jung", sex,
        // "03", "25", "1995", level, testESLStudent.addStudent());
    // }
    
        
}
