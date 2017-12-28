package by.bsuir.labs.service;

import java.awt.event.MouseEvent;

import by.bsuir.labs.model.Polyline;
import by.bsuir.labs.util.ChooseServiceBtnMouseListener;
import by.bsuir.labs.util.Point;
import by.bsuir.labs.view.ShapesDrawer;

public class PolylineDrawService extends MultidotShapeDrawService {

	public PolylineDrawService(ShapesDrawer shapesDrawer) {
        super(shapesDrawer);
        getChooseServiceBtn().setText("Polyline");
        getChooseServiceBtn().addMouseListener(new ChooseServiceBtnMouseListener(shapesDrawer){
            public void mousePressed(MouseEvent e){
                getShapesDrawer().setDrawService(PolylineDrawService.this);
            }
        });
    }

    protected Polyline createMultidotShape(Point point){
        return new Polyline(point);
    }
    
}
