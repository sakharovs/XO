import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 25.04.2016.
 */
public class PanelClass extends JPanel {
    public PanelClass() {
        setBackground(Color.cyan);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        for (int i = 0; i <= 40; i++) {
            g.drawLine(0, i * 40, getWidth(), i * 40);
            g.drawLine(i * 40, 0, i * 40, getHeight());

        }
    }
}

