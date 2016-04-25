import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by User on 25.04.2016.
 */
public class WindowClass extends JFrame {
    public WindowClass(){

        setTitle("Новое окно с меню");
        setSize(407, 455);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        PanelClass mainPan = new PanelClass();
        add (mainPan, BorderLayout.CENTER);

        JMenuBar menuBar=new JMenuBar();
        JMenu fileMenu=new JMenu("File");
        menuBar.add(fileMenu);
        JMenu colorMenu=new JMenu("Цвет");
        fileMenu.add(colorMenu);
        JMenuItem colorMenuItem=new JMenuItem("Изменть цвет");
        colorMenu.add(colorMenuItem);
        JMenuItem whiteColor=new JMenuItem("Установить белый фон");
        colorMenu.add(whiteColor);
        whiteColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPan.setBackground(Color.white);
            }
        });
        colorMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Random rnd= new Random();
                int col1= rnd.nextInt(255);
                int col2=rnd.nextInt(255);
                int col3=rnd.nextInt(255);

                mainPan.setBackground(new Color(col1, col2, col3));
            }
        });
        fileMenu.addSeparator();
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setJMenuBar(menuBar);






        setVisible(true);
    }


}