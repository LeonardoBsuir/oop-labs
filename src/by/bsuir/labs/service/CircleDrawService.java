package by.bsuir.labs.service;

import java.awt.event.MouseEvent;

import by.bsuir.labs.model.Circle;
import by.bsuir.labs.util.ChooseServiceBtnMouseListener;
import by.bsuir.labs.util.Point;

public class CircleDrawService extends DrawService {

	public CircleDrawService(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseServiceBtn().setText("Circle");
        getChooseServiceBtn().addMouseListener(new ChooseServiceBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e){
                getShapesDrawer().setDrawService(CircleDrawService.this);
            }
        });
    }


    @Override
    public void mousePressed(MouseEvent e) {
        drawingShape = new Circle(new Point(e), 1);
        createShape(drawingShape);
    }

}
