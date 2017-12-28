package by.bsuir.labs.model;

import java.awt.Graphics;

import by.bsuir.labs.util.Point;

public class Polygon extends Polyline {
	
	public Polygon(){}

    public Polygon(Point point){
        super(point);
    }

    public void draw(Graphics g){
        g.setColor(getBorderColor());
        g.drawPolygon(getXs(), getYs(), getPointsCount());
    }
}
