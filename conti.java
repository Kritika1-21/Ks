class box{
    double width;
    double height;
    double depth;
    double volume(){
        System.out.println("volume is:");
        return width*depth*height;

    }

}
public class conti{
    public static void main(String args[]){
        box mybox1=new box();
        box mybox2=new box();
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        mybox2.height=12;
        mybox2.depth=45;
        mybox2.width=12;
        double b=mybox1.volume();
         double a=mybox2.volume();
         System.out.println(a);
         System.out.println(b);
    }
}