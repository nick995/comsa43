import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Document document =  Document.getInstance();

        document.createTextFile("Project4");
        document.open("Project4");
        Paragraph paragraph1 = new Paragraph("Second paragraph for Section 1", Style.LEFT);
        Paragraph paragraph2 = new Paragraph("Thrid Paragraph for Section 1", Style.LEFT);
        Paragraph paragraph3 = new Paragraph("First paragraph for Section 1 and test addHead", Style.LEFT);
        Section section1 = new Section();

        section1.add(paragraph1,0);
        section1.add(paragraph2,1);
        section1.addHead(paragraph3);

        Paragraph paragraph4 = new Paragraph("Frist paragraph for Section 2", Style.HEADING_THREE);
        Section section2 = new Section();

        section2.add(paragraph4,0);


        document.addSection(section1);

        document.writeFile("Project4", section1);
        document.writeFile("Project4", section2);

        document.open("Project4");
    }

}