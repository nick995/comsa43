import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.*;



public class GUI extends JFrame{


    private Toolkit toolkit;
    private int minRatio = 40;
    private int maxRatio = 70;
    private int ratioValue = 55;


    private int minDepth = 2;
    private int maxDepth = 10;
    private int depthValue = 5;

    JSlider ratioSlider = new JSlider(JSlider.HORIZONTAL,minRatio,maxRatio,ratioValue);

    JSlider depthSlider = new JSlider(JSlider.HORIZONTAL,minDepth,maxDepth,depthValue);

    private Color parentsColor = Color.WHITE;
    private Color childColor = Color.BLACK;

    public void GUIDesign() {
        setTitle("Setting board");
        setSize(400, 500);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        //Set up the Ratio settings
        JLabel String1 = new JLabel("Ratio:");
        String1.setBounds(50, 50, 60, 30);
        JLabel String2 = new JLabel("Depth:");
        String2.setBounds(50, 150, 60, 30);
        add(String1);
        add(String2);

/* ========================================================================
                            RATIO SLIDER
   ========================================================================
 */
        ratioSlider.setPaintTicks(true);
        ratioSlider.setPaintLabels(true);
        ratioSlider.setMajorTickSpacing(5);
        ratioSlider.setMinorTickSpacing(1);

        JLabel ratioLabel = new JLabel();

        ratioSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                ratioLabel.setText("Ratio: [ " + ((JSlider)e.getSource()).getValue()+ "% ] ");
                ratioValue = ratioSlider.getValue();
            }
        });

        ratioLabel.setBounds(210, 90, 100, 40);
        add(ratioLabel); // Adding textLabel to the Frame

        JPanel sliderPanel1 = new JPanel();
        sliderPanel1.setBounds(100,40,300,50);
        sliderPanel1.add(ratioSlider); //Adding slider to the panel

        add(sliderPanel1); // Adding panel to the Frame

/* ========================================================================
                    DEPTH SLIDER
   ========================================================================
 */
        depthSlider.setPaintTicks(true);
        depthSlider.setPaintLabels(true);
        depthSlider.setMajorTickSpacing(1);

        JLabel depthLabel = new JLabel();

        depthSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                depthLabel.setText("Depth: [ " + ((JSlider)e.getSource()).getValue()+ " ] times ");
                depthValue = depthSlider.getValue();
            }
        });

        depthLabel.setBounds(200, 200, 150, 40);
        add(depthLabel); // Adding textLabel to the Frame

        JPanel depthPanel = new JPanel();
        depthPanel.setBounds(100,150,300,50);
        depthPanel.add(depthSlider); //Adding slider to the panel

        add(depthPanel); // Adding panel to the Frame
/* ========================================================================

   ========================================================================
 */

    JPanel colorPanel = new JPanel();
    colorPanel.setLayout(null);

    JLabel colorLabel = new JLabel("Parents color => ");

    colorLabel.setBounds(40,260,120,30);

    add(colorLabel);

    JButton colorButton = new JButton("!");

    colorButton.setBounds(160,260,40,40);

    JPanel display = new JPanel();

    colorButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JColorChooser clr = new JColorChooser();
            Color color = clr.showDialog(display, "Choose Color",
                    Color.white);
            display.setBackground(color);
            parentsColor = display.getBackground();
        }
    });

    display.setBackground(Color.WHITE);
    display.setBounds(240,240,100,70);

    add(colorButton); // adding color button
    add(display); // adding display color panel

        /* ========================================================================

   ========================================================================
 */

        JPanel colorPanel2 = new JPanel();
        colorPanel2.setLayout(null);

        JLabel colorLabel2 = new JLabel("Child color => ");

        colorLabel2.setBounds(40,350,120,30);

        add(colorLabel2);

        JButton colorButton2 = new JButton("!");

        colorButton2.setBounds(160,350,40,40);

        JPanel display2 = new JPanel();

        colorButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JColorChooser clr = new JColorChooser();
                Color color = clr.showDialog(display2, "Choose Color",
                        Color.red);
                display2.setBackground(color);
                childColor = display2.getBackground();
            }
        });

        display2.setBackground(Color.WHITE);
        display2.setBounds(240,330,100,70);

        add(colorButton2); // adding color button
        add(display2); // adding display color panel

        JButton go = new JButton("GO");
        go.setBounds(170, 420, 60, 40);
//        go.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent event) {
//                toolkit.beep();
//                fractalGenerator.setData(ratio, depth, cactusColor, pearColor);
//
//            }
//
//        });

        add(go);

        setResizable(false);
        setVisible(true);

    }


    public static void main(String[] args){
        GUI gui = new GUI();
        gui.GUIDesign();
    }

}