package Elso;

import java.util.Date;

public class GeometricShape{
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated = new Date();

    public GeometricShape() {
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled ;
    }
}