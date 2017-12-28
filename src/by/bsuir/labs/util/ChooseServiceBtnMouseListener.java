package by.bsuir.labs.util;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import by.bsuir.labs.view.ShapesDrawer;

public abstract class ChooseServiceBtnMouseListener extends MouseAdapter {
    private ShapesDrawer shapesDrawer;

    public ChooseServiceBtnMouseListener(ShapesDrawer shapesDrawer) {
        this.shapesDrawer = shapesDrawer;
    }

    public abstract void mousePressed(MouseEvent e);

    protected ShapesDrawer getShapesDrawer(){
        return shapesDrawer;
    }
}
