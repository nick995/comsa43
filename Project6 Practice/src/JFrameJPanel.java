import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Color;

public class JFrameJPanel extends JFrame {

    private Toolkit toolkit;

    public JFrameJPanel() {
        setSize(500, 200); // passing size
        toolkit = getToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        setLocation((screenSize.width - getWidth())/2, (screenSize.height - getHeight())/2);
        setTitle("My Smarter JFrame"); // title name
        setResizable(false); // change windows size

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameJPanel myFrame = new JFrameJPanel();
        myFrame.setVisible(true);
    }
}
