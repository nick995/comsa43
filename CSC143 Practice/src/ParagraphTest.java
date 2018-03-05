//
//
//import static org.junit.Assert.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
///**
// * The test class ParagraphTest.
// *
// * @author  (your name)
// * @version (a version number or a date)
// */
//public class ParagraphTest
//{
//    @Test
//    public void testParagraph(){
//        Paragraph paragraph1 = new Paragraph("222", Style.LEFT);
//        Paragraph paragraph2 = new Paragraph("111", Style.BULLETTED);
//        Paragraph paragraph3 = new Paragraph("333", Style.HEADING_THREE);
//
//        assertEquals("222", paragraph1.getText());
//        assertEquals("111", paragraph2.getText());
//        assertEquals("333", paragraph3.getText());
//        assertEquals(Style.LEFT, paragraph1.getStyle());
//        assertEquals(Style.BULLETTED, paragraph2.getStyle());
//        assertEquals(Style.HEADING_THREE, paragraph3.getStyle());
//
//    }
//
//    @Test (expected=IllegalArgumentException.class)
//    public void testNullText(){
//        Paragraph paragraph1 = new Paragraph(null, Style.LEFT);
//    }
//
//    @Test (expected=IllegalArgumentException.class)
//    public void testNullStyle(){
//        Paragraph paragraph1 = new Paragraph("111", null);
//    }
//}
