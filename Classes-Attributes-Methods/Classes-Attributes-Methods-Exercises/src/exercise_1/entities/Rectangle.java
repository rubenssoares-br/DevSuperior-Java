package exercise_1.entities;

public class Rectangle {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        double area = width * height;

        return area;
    }

    public double perimeter() {
        double perimeter = (height * 2) + (width * 2);
        return perimeter;
    }

    public double diagonal() {
        double sumSquaredValues = Math.pow(height, 2) + Math.pow(width, 2);

        double diagonal = Math.sqrt(sumSquaredValues);

        return diagonal;
    }
}
