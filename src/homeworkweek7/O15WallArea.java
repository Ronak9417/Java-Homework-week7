package homeworkweek7;

/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 * height parameter is less than 0 it needs to set the height field value to 0.
 */
public class O15WallArea {
    double width,height;
    //Declare a main method
    public static void main(String[] args)
    {

        O15WallArea o15WallArea = new O15WallArea(5,4);
        System.out.println("area= " + o15WallArea.getArea());
        o15WallArea.setHeight(-1.5);
        System.out.println("width= " + o15WallArea.getWidth());
        System.out.println("height= " + o15WallArea.getHeight());
        System.out.println("area= " + o15WallArea.getArea());
    }
    public O15WallArea(){}
    // Create an instance method with params
    public O15WallArea(double width, double height) {
        if (width < 0) {
            width = 0;
        } else if (height < 0) {
            height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    //Create void method without params
    public double getWidth(){
        return width;
    }
    //Create void method without params
    public double getHeight()
    {
        return height;
    }
    //Create void method with params
    public void setWidth(double width)
    {
        if (width<0)
        {
            width=0;
        }
        this.width = width;
    }
    //Create void method with params
    public void setHeight(double height)
    {
        if (height<0)
        {
            height=0;
        }
        this.height = height;
    }
    //Create void method without params
    public double getArea()
    {
        double area = height*width;
        return area;
    }

}
