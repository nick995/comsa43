//
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
///**
// * The test class StorUnitsTest.
// *
// * @author  (your name)
// * @version (a version number or a date)
// */
//public class StorUnitsTest
//{
//   @Test
//   public void testStorUnitsCon(){
//      StorUnits storUnits = new StorUnits(4, 4, 120);
//
//      assertEquals(4 , 4,  storUnits.getWidth());
//      assertEquals(4, 4, storUnits.getHeight());
//      assertEquals(120, 120, storUnits.getRentedPrice());
//      assertEquals(UnitType.STANDARD , storUnits.getType());
//   }
//   /*
//    * TESTING PRECONDITION
//    */
//
//   @Test(expected = IllegalArgumentException.class)
//   public void testWidthPreCondition(){
//      StorUnits storUnits = new StorUnits(5, 4, 120);
//      StorUnits storUnits1 = new StorUnits(7, 4, 120);
//      StorUnits storUnits3 = new StorUnits(133, 4, 120);
//
//   }
//
//   @Test(expected = IllegalArgumentException.class)
//   public void testHeightPreCondition(){
//      StorUnits storUnits = new StorUnits(4, 123, 120);
//      StorUnits storUnits1 = new StorUnits(4, 445, 120);
//      StorUnits storUnits2 = new StorUnits(4, 3, 120);
//      StorUnits storUnits3 = new StorUnits(4, -1, 120);
//   }
//}
