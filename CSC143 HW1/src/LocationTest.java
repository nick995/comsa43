//package src;
//
//
//
//import static org.junit.Assert.*;
//import java.util.Date;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
///**
// * The test class LocationTest.
// *
// * @author  (your name)
// * @version (a version number or a date)
// */
//public class LocationTest
//{
//   @Test
//   public void testLocationCon(){
//       //testing constrouctor
//
//       Location myLocation = new Location("WA02Seattle");
//
//       assertEquals("WA02Seattle",     myLocation.getLocationName());
//
//       Customer customer1 = new Customer("Jiwon Jung","000-000-0000", 200);
//       Customer customer2 = new Customer("Sean Monaco", "000-123-1234", 300);
//
//       myLocation.addCustomer(customer1);
//       myLocation.addCustomer(customer2);
//
//
//
//   }
//   @Test
//   public void testCustCount(){
//       Location myLocation = new Location("WA02Seattle");
//       Customer customer1 = new Customer("Jiwon Jung","000-000-0000", 200);
//       Customer customer2 = new Customer("Sean Monaco", "000-123-1234", 300);
//       myLocation.addCustomer(customer1);
//       myLocation.addCustomer(customer2);
//       myLocation.getStorUnits(1,1).rentUnit(10, customer1, new Date(12/13/2017));
//       myLocation.getStorUnits(1,3).rentUnit(10, customer2, new Date(12/13/2017));
//       assertEquals(2, myLocation.getCustCount());
//
//    }
//
//
//    //Testing getCustomer method
//    @Test
//    public void testGetCustomersUnits(){
//        Location myLocation = new Location("WA02Seattle");
//       Customer customer1 = new Customer("Jiwon Jung","000-000-0000", 200);
//       Customer customer2 = new Customer("Sean Monaco", "000-123-1234", 300);
//       Customer customer3 = new Customer("Mingyu Jung", "123-123-1234", 400);
//       myLocation.addCustomer(customer1);
//       myLocation.addCustomer(customer2);
//       myLocation.addCustomer(customer3);
//       myLocation.getStorUnits(2,1).rentUnit(10, customer1, new Date(12/13/2017));
//       myLocation.getStorUnits(1,3).rentUnit(20, customer1, new Date(12/25/2017));
//       myLocation.getStorUnits(10,10).rentUnit(20, customer1, new Date(12/25/2017));
//       myLocation.getStorUnits(5,5).rentUnit(20, customer1, new Date(12/25/2017));
//       myLocation.getStorUnits(1,1).rentUnit(20, customer1, new Date(12/25/2017));
//       assertEquals(5,  myLocation.getCustomersUnits(customer1).length);
//
//
//
//
//    }
//    //TESTING GETCUSTOMERAT
//    @Test
//    public void testGetCustomerAt(){
//        Location myLocation = new Location("WA02Seattle");
//        Customer customer1 = new Customer("Jiwon Jung","000-000-0000", 200);
//        Customer customer2 = new Customer("Sean Monaco", "000-123-1234", 300);
//        myLocation.addCustomer(customer1);
//        myLocation.addCustomer(customer2);
//        myLocation.getStorUnits(1,1).rentUnit(10, customer1, new Date(12/13/2017));
//        myLocation.getStorUnits(1,3).rentUnit(10, customer2, new Date(12/13/2017));
//        assertEquals(customer1, myLocation.getCustomerAt(0));
//        assertEquals(customer2, myLocation.getCustomerAt(1));
//
//    }
//    //TESTING CHARGE
//    @Test
//    public void testCharge(){
//        Location myLocation = new Location("WA02Seattle");
//        Customer customer1 = new Customer("Jiwon Jung","000-000-0000", 200);
//        Customer customer2 = new Customer("Sean Monaco", "000-123-1234", 300);
//        myLocation.addCustomer(customer1);
//        myLocation.addCustomer(customer2);
//        myLocation.getStorUnits(1,1).rentUnit(10, customer1, new Date(12/13/2017));
//        myLocation.getStorUnits(1,3).rentUnit(10, customer2, new Date(12/13/2017));
//        assertEquals(200-myLocation.getStorUnits(1,1).getRentedPrice(),190,  customer1.debitAmount(10));
//    }
//
//}
