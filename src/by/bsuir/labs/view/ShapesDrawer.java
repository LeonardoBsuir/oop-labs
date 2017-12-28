package by.bsuir.labs.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import by.bsuir.labs.model.Shape;
import by.bsuir.labs.service.DrawService;

public class ShapesDrawer extends JPanel {

	private List<Shape> shapesList =  new ArrayList<>();
    DrawService drawService;

    public ShapesDrawer(){
        setBackground(Color.WHITE);
    }

    private JButton undoButton = new JButton("Back");
    {
        undoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                removeLast();
            }
        });
    }

    public JButton getUndoButton(){
        return undoButton;
    }

    public void draw(){
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapesList){
            shape.draw(g);
        }
    }

    private void removeListeners(){
        removeMouseListener(drawService);
        removeMouseMotionListener(drawService);
    }

    public void setDrawService(DrawService drawService){
        if (this.drawService != null) {
            this.drawService.finishDrawing();
        }
        removeListeners();
        this.drawService = drawService;
        addMouseListener(drawService);
        addMouseMotionListener(drawService);
    }

    private void removeLast(){
        if (shapesList.size() > 0) {
            shapesList.remove(shapesList.size() - 1);
        }
        draw();
    }

    public void addShape(Shape f) {
        shapesList.add(f);
    }

}
