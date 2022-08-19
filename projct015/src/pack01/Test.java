package pack01;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class Test {
    private  static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("My Paint");
        frame.setSize(500,450);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new MyPanel());
        frame.setVisible(true);

    }
}
