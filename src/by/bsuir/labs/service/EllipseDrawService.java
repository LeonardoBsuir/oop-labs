package by.bsuir.labs.service;

import java.awt.event.MouseEvent;

import by.bsuir.labs.model.Ellipse;
import by.bsuir.labs.util.ChooseServiceBtnMouseListener;
import by.bsuir.labs.util.Point;
import by.bsuir.labs.view.ShapesDrawer;

public class EllipseDrawService extends DrawService {

	public EllipseDrawService(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseServiceBtn().setText("Ellipse");
        getChooseServiceBtn().addMouseListener(new ChooseServiceBtnMouseListener(shapesDrawer) {
            public void mousePressed(MouseEvent e) {
                getShapesDrawer().setDrawService(EllipseDrawService.this);
            }
        });
    }

    @Override
    public void mousePressed(MouseEvent e) {
        drawingShape = new Ellipse(new Point(e), 2, 2);
        createShape(drawingShape);
    }

}
