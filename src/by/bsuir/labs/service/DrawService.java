package by.bsuir.labs.service;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import by.bsuir.labs.model.Shape;
import by.bsuir.labs.util.Point;

public abstract class DrawService extends MouseAdapter {
	
	private ShapesDrawer shapesDrawer;
    private JButton chooseServiceBtn = new JButton();
    protected Shape drawingShape;

    public JButton getChooseServiceBtn() {
        return chooseServiceBtn;
    }

    public DrawService(ShapesDrawer shapesDrawer) {
        this.shapesDrawer = shapesDrawer;
    }

    protected void createShape(Shape shape) {
        shapesDrawer.addShape(shape);
        shapesDrawer.draw();
    }

    public abstract void mousePressed(MouseEvent e);

    public void finishDrawing() {
    }

    public void mouseDragged(MouseEvent e) {
        drawingShape.refreshShape(new Point(e));
        shapesDrawer.draw();
    }

    protected ShapesDrawer getShapesDrawer() {
        return shapesDrawer;
    }
}
