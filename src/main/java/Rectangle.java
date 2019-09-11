public class Rectangle extends Shape {
    private double width,length;

    public Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length,String color, boolean filled ){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public String getColor(){
        return super.getColor();
    }
    public void setColor(String color){
        super.setColor(color);
    }
    public boolean isFilled(){
        return super.isFilled();
    }
    public void setFilled(boolean filled){
        super.setFilled(filled);
    }
    @Override
    public String toString(){
        return "A Rectangle with width=" + this.getWidth()+
                "and length= "+ this.getLength()+
                ", which is a subclass of "+
                super.toString();
    }
    public double getArea(){
       return this.width*this.length;
    }
    public double getPerimeter(){
        return (this.width+this.length)*2;
    }


}
