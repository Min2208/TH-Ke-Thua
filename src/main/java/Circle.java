public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
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
        return "A Circle with radius="+ this.getRadius() +", Which is a subclass of "+ super.toString() ;
    }
}
