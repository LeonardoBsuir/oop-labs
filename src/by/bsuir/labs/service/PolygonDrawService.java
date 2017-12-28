package by.bsuir.labs.service;

import java.awt.event.MouseEvent;

import by.bsuir.labs.model.Polygon;
import by.bsuir.labs.util.ChooseServiceBtnMouseListener;
import by.bsuir.labs.util.Point;
import by.bsuir.labs.view.ShapesDrawer;

public class PolygonDrawService extends MultidotShapeDrawService {

	public PolygonDrawService(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseServiceBtn().setText("Polygon");
        getChooseServiceBtn().addMouseListener(new ChooseServiceBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e){
                getShapesDrawer().setDrawService(PolygonDrawService.this);
            }
        });
    }

    protected Polygon createMultidotShape(Point point){
        return new Polygon(point);
    }

}
