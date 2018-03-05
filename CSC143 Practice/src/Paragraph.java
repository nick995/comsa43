public class Paragraph {
    private String text;
    private Style style;

    public Paragraph(String text, Style style){
        if(text == null || style == null){
            throw new IllegalArgumentException("The text cannot be Null or None");
        }
        this.text = text;
        this.style = style;

    }

    public String getText(){
        return text;
    }

    public Style getStyle() {
        return style;
    }


    public void setText(String text) {
        this.text = text;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public String toString() {
        String report = "";

        report += getText();
        report += getStyle();
        return report;
    }
}