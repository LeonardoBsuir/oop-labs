package by.bsuir.labs.view;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import by.bsuir.labs.service.CircleDrawService;
import by.bsuir.labs.service.EllipseDrawService;
import by.bsuir.labs.service.LineDrawService;
import by.bsuir.labs.service.PolygonDrawService;
import by.bsuir.labs.service.PolylineDrawService;
import by.bsuir.labs.service.RectangleDrawService;
import by.bsuir.labs.service.SquareDrawService;
import by.bsuir.labs.service.TriangleDrawService;

public class MainWindow extends JPanel {
	
	static ShapesDrawer shapesDrawer = new ShapesDrawer();

    public MainWindow() {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(shapesDrawer, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.X_AXIS));
        buttonsPanel.add(new LineDrawService(shapesDrawer).getChooseServiceBtn());
        buttonsPanel.add(new RectangleDrawService(shapesDrawer).getChooseServiceBtn());
        buttonsPanel.add(new TriangleDrawService(shapesDrawer).getChooseServiceBtn());
        buttonsPanel.add(new SquareDrawService(shapesDrawer).getChooseServiceBtn());
        buttonsPanel.add(new EllipseDrawService(shapesDrawer).getChooseServiceBtn());
        buttonsPanel.add(new CircleDrawService(shapesDrawer).getChooseServiceBtn());
        buttonsPanel.add(new PolygonDrawService(shapesDrawer).getChooseServiceBtn());
        buttonsPanel.add(new PolylineDrawService(shapesDrawer).getChooseServiceBtn());
        buttonsPanel.add(shapesDrawer.getUndoButton());

        add(buttonsPanel, BorderLayout.CENTER);
    }

}
