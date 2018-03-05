import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Document {

    LinkedList<Section> list = new LinkedList<>();
    private static Document document;

    private Document() {

    }
    
    /**
     * singletone document
     *
     * @param  
     * @return     document
     */
    public static synchronized Document getInstance() {
        if (document == null)
            document = new Document();
        return document;
    }
    /**
     * adding section 
     *
     * @param  section
     */
    public void addSection(Section section) {
        list.insertAtEnd(section);
    }

    /**
     * removing section in specific sectoin
     *
     * @param  position
     */

    private Section removeSection(int position) {
        return list.remove(position);

    }
    
    /**
     * creating text file
     *
     * @param  textFileName 
     */
    
    public void createTextFile(String textFileName) {

        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(textFileName));
        } catch (IOException e) {
            System.out.println(textFileName + "is not able to open");
            e.printStackTrace();
        }
    }

    public void writeFile(String textFileName, Section section) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(textFileName, true));
        bufferedWriter.write(String.valueOf(section));
        bufferedWriter.close();


    }
    
    
}