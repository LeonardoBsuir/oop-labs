package by.bsuir.labs.service;

import java.awt.event.MouseEvent;

import by.bsuir.labs.model.Line;
import by.bsuir.labs.util.ChooseServiceBtnMouseListener;
import by.bsuir.labs.util.Point;
import by.bsuir.labs.view.ShapesDrawer;

public class LineDrawService extends DrawService{

	public LineDrawService(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseServiceBtn().setText("Line");
        getChooseServiceBtn().addMouseListener(new ChooseServiceBtnMouseListener(shapesDrawer) {
            public void mousePressed(MouseEvent e) {
                getShapesDrawer().setDrawService(LineDrawService.this);
            }
        });
    }

    public void mousePressed(MouseEvent e) {
        drawingShape = new Line(new Point(e.getX(), e.getY()));
        createShape(drawingShape);
    }
}
