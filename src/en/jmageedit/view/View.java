package en.jmageedit.view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class View {
    private static final int START_WIDTH = 500;
    private static final int START_HEIGHT = 250;
    private final JFrame imageFrame = new JFrame();
    
    private final JMenuBar menuBar = new JMenuBar();
    
    public View() {
        JMenu file = new JMenu("File");
        
        JMenuItem open = new JMenuItem("Open");
        file.add(open);
        
        menuBar.add(file);
        
        JMenu edit = new JMenu("Edit");
        
        // TODO edit stuff
        
        menuBar.add(edit);
        
        JMenu filter = new JMenu("Filter");
        
        // TODO filter stuff
        
        menuBar.add(filter);
        
        imageFrame.setJMenuBar(menuBar);
        
        imageFrame.setTitle("JmageEdit");
        imageFrame.setBounds(getCentered(START_WIDTH, START_HEIGHT));
        imageFrame.setLayout(null); // very bad. do not do
        JLabel lbl = new JLabel("Open an image above.");
        lbl.setBounds(START_WIDTH / 2 - 70, START_HEIGHT / 2 - 30, 200, 50);
        imageFrame.add(lbl);
        imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imageFrame.setVisible(true);
    }
    
    /**
     * Given bounds of window, returns rectangle with those bounds centered on the screen.
     * 
     * @param width
     * @param height
     * @return
     */
    private static final Rectangle getCentered(int width, int height) {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        return new Rectangle(d.width / 2 - width / 2, d.height / 2 - height / 2, width, height);
    }
}