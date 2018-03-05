//
//
//import static org.junit.Assert.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
///**
// * The test class SectionTest.
// *
// * @author  (your name)
// * @version (a version number or a date)
// */
//public class SectionTest
//{
//     @Test
//    public void testSection(){
//        Paragraph paragraph1 = new Paragraph("222", Style.LEFT);
//        Paragraph paragraph2 = new Paragraph("111", Style.BULLETTED);
//        Paragraph paragraph3 = new Paragraph("333", Style.HEADING_THREE);
//        Paragraph paragraph4 = new Paragraph("for deleting", Style.HEADING_FOUR);
//        Section section = new Section();
//
//        section.add(paragraph1,0);
//        section.addHead(paragraph2);
//        section.add(paragraph4,2);
//         section.addTale(paragraph3);
//
//         section.remove(2);
//
//        assertEquals("111", section.getList().getAt(0).getText());
//        assertEquals("222", section.getList().getAt(1).getText());
//        assertEquals("333", section.getList().getAt(2).getText());
//
//        assertEquals(3, section.getSize());
//
//     }
//}
