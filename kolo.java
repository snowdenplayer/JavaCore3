package ua.lviv.lgs;


public class kolo {
    private double diametr;
    private double radius;

    public kolo(double diametr, double radius){
        this.diametr = diametr;
        this.radius = radius;
    }

    public double getWidth(){
        double width = this.radius*2*(Math.PI);
        return width;
    }

    public double getArea(){
        double width;
        width = Math.PI*(Math.pow(this.diametr,2)/4);
        return width;
    }


}