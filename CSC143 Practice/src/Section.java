

public class Section {

    LinkedList<Paragraph> list = new LinkedList<>();
    Paragraph paragraph = new Paragraph("",Style.LEFT);

    //**********************************************************************************************
    //          CONSTRUCTORS
    //**********************************************************************************************

    public Section(){

    }
    /**
     * Retrieves the previous node
     *
     * @return      the previous node
     */

    public void addHead(Paragraph parag){
        list.insertAtBeg(parag);
    }

    public void addTale(Paragraph parag){
        list.insertAtEnd(parag);
    }

    public void add(Paragraph parag, int position){
        list.insertAtPosition(parag, position);
    }

    public Paragraph remove(int position) {
        return list.remove(position);
    }

    public int getSize() {
        return list.getSize();
    }

    public LinkedList <Paragraph> getList() {
        return list;
    }

    public Paragraph getParagraph() {
        return paragraph;
    }

    @Override
    public String toString() {
        String paragraph = "";

        for(int size =0; size< getSize(); size++){
            paragraph += "Pragraph # "   +    (size+1)                   + "\n";
            paragraph += "Paragraph:   " +    list.getAt(size).getText() + "\n";
            paragraph += "Style: "       +    getParagraph().getStyle()  + "\n";
        }
        return paragraph;
    }
}
