package pack01;

import Model.MyLine;

import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Scanner;


public  class MyPanel extends JPanel {
    private MyLine shape;
    private ArrayList<MyLine> Shapes =new ArrayList<MyLine>();
    private boolean flagLine;



    MyPanel() {
        this.setLayout(new BorderLayout());
        PanelPallette panelPalette = new PanelPallette();
        panelPalette .setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0),5));
        panelPalette .setBackground(Color.white);
        this.add(panelPalette,BorderLayout.CENTER);
   }



class  PanelPallette extends  JPanel implements MouseListener,MouseMotionListener {


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

            shape = new MyLine();
            ((MyLine) shape).setPoint1(e.getPoint());

    }

    @Override
    public void mouseReleased(MouseEvent e) {

            ((MyLine) shape).setPoint2(e.getPoint());
            Shapes.add(shape);
            repaint();


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.addMouseListener(this);
            this.addMouseMotionListener(this);
            for (int i = 0; i < Shapes.size(); i++) {
                Shapes.get(i).draw(g);
            }
        }

    }
}
