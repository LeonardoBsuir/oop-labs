package by.bsuir.labs.service;

import java.awt.event.MouseEvent;

import by.bsuir.labs.model.Square;
import by.bsuir.labs.util.ChooseServiceBtnMouseListener;
import by.bsuir.labs.util.Point;
import by.bsuir.labs.view.ShapesDrawer;

public class SquareDrawService extends DrawService {

	public SquareDrawService(ShapesDrawer shapesDrawer){
        super(shapesDrawer);
        getChooseServiceBtn().setText("Square");
        getChooseServiceBtn().addMouseListener(new ChooseServiceBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e){
                getShapesDrawer().setDrawService(SquareDrawService.this);
            }
        });
    }

    @Override
    public void mousePressed(MouseEvent e){
        drawingShape = new Square(new Point(e.getX(), e.getY()), 1);
        createShape(drawingShape);
    }
}
