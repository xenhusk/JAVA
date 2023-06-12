public class Rectangle extends Shape {
    private double length,width;
    double Perimeter,Area;
    public void setRectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getlength(){
return length;
    }
    public double getwidth(){
return width;
    }
    public void area(){
         Area = length*width;
    }
    public void perimeter(){
         Perimeter = length*2+width*2;
    }

    public String toString(){
        return "Area: "+Area+"\nPerimeter: "+Perimeter;
       }
}
