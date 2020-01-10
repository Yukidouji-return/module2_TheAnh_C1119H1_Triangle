public class Triangle extends Shape {
    private double side1 = 1, side2 = 1, side3 = 1, area, perimeter;

    public Triangle() {
        this.area = Math.sqrt((this.side1 + this.side2 + this.side3) *
                (this.side1 + this.side2 - this.side3) *
                (this.side2 + this.side3 - this.side1) *
                (this.side3 + this.side1 - this.side2)
        ) / 4;
        this.perimeter = this.side1 + this.side2 + this.side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.area = Math.sqrt((this.side1 + this.side2 + this.side3) *
                (this.side1 + this.side2 - this.side3) *
                (this.side2 + this.side3 - this.side1) *
                (this.side3 + this.side1 - this.side2)
        ) / 4;
        this.perimeter = this.side1 + this.side2 + this.side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Area =" + this.area +
                ",Perimeter = "+ this.perimeter +
                ", color = '" + this.color + '\'' +
                ", filled = " +(this.filled ? "is filled" : "isn't filled") +
                '}';
    }
}
