package by.bsuir.labs.service;

import java.awt.event.MouseEvent;

import by.bsuir.labs.model.Triangle;
import by.bsuir.labs.util.ChooseServiceBtnMouseListener;
import by.bsuir.labs.util.Point;
import by.bsuir.labs.view.ShapesDrawer;

public class TriangleDrawService extends DrawService{

	 public TriangleDrawService(ShapesDrawer shapesDrawer) {
	        super(shapesDrawer);
	        getChooseServiceBtn().setText("Triangle");
	        getChooseServiceBtn().addMouseListener(new ChooseServiceBtnMouseListener(shapesDrawer){
	            public void mousePressed(MouseEvent e) {
	                getShapesDrawer().setDrawService(TriangleDrawService.this);
	            }
	        });
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
	        Point pressedPoint = new Point(e.getX(), e.getY());
	        drawingShape = new Triangle(pressedPoint, pressedPoint);
	        createShape(drawingShape);
	    }

}
