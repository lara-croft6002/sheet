import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample extends JFrame {
    private JTextField textField;

    public MouseEventExample() {
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 200, 300, 30);
        add(textField);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                textField.setText("Mouse Clicked at: (" + x + ", " + y + ")");
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                setTitle("Mouse Moved at: (" + x + ", " + y + ")");
            }
        });
    }

    public static void main(String[] args) {
        MouseEventExample frame = new MouseEventExample();
        frame.setVisible(true);
    }
}
