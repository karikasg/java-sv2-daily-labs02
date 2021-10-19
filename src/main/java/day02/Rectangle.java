package day02;

public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int calculateArea(){
        return(sideA*sideB);
    }
}
