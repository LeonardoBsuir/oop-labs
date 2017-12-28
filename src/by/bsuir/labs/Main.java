package by.bsuir.labs;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import by.bsuir.labs.service.CircleDrawService;
import by.bsuir.labs.service.EllipseDrawService;
import by.bsuir.labs.service.LineDrawService;
import by.bsuir.labs.service.PolygonDrawService;
import by.bsuir.labs.service.PolylineDrawService;
import by.bsuir.labs.service.RectangleDrawService;
import by.bsuir.labs.service.ShapesDrawer;
import by.bsuir.labs.service.SquareDrawService;
import by.bsuir.labs.service.TriangleDrawService;

public class Main extends JPanel{
	static ShapesDrawer shapesDrawer = new ShapesDrawer();

    public Main() {

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


    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("DrawService");
        mainFrame.setVisible(true);
        mainFrame.setMinimumSize(new Dimension(1200, 700));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setContentPane(new Main());
        mainFrame.pack();
    }
}
