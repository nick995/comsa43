import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FileChooserDialog extends JFrame {
    private JPanel panel;
    private JPanel display;
    public FileChooserDialog() {
        setTitle("FileChooserDialog");
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        ImageIcon open = new ImageIcon("color.png");
        JToolBar toolbar = new JToolBar();
        JButton openb = new JButton(open);
        openb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JFileChooser file = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
                file.setFileFilter(filter);
                file.showOpenDialog(panel);
                System.out.println(file.getSelectedFile().getName());

                // Example with SAVE instead of OPEN dialog
                file.showSaveDialog(panel);
            }
        });
        toolbar.add(openb);
        display = new JPanel();
        display.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        panel.add(display);
        add(panel);
        add(toolbar, BorderLayout.NORTH);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FileChooserDialog();
    }
}