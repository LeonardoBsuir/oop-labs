package by.bsuir.labs.model;

import java.awt.Color;
import java.awt.Graphics;

import by.bsuir.labs.util.Point;

public abstract class Shape {

	private Color borderColor;

    public Shape(){
        borderColor = Color.BLUE;
    }

    public Color getBorderColor(){
        return borderColor;
    }

    public void setBorderColor(Color borderColor){
        this.borderColor = borderColor;
    }

    public abstract void refreshShape(Point point);

    public abstract void draw(Graphics g);
	
}
