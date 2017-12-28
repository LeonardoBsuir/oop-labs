package by.bsuir.labs.service;

import java.awt.event.MouseEvent;

import by.bsuir.labs.model.Rectangle;
import by.bsuir.labs.util.ChooseServiceBtnMouseListener;
import by.bsuir.labs.util.Point;
import by.bsuir.labs.view.ShapesDrawer;

public class RectangleDrawService extends DrawService {

	 public RectangleDrawService(ShapesDrawer shapesDrawer){
	        super(shapesDrawer);
	        getChooseServiceBtn().setText("Rectangle");
	        getChooseServiceBtn().addMouseListener(new ChooseServiceBtnMouseListener(shapesDrawer){
	            public void mousePressed(MouseEvent e){
	                getShapesDrawer().setDrawService(RectangleDrawService.this);
	            }
	        });
	    }

	    public void mousePressed(MouseEvent e){
	        drawingShape = new Rectangle(new Point(e.getX(), e.getY()), 1, 1);
	        createShape(drawingShape);
	    }

}
