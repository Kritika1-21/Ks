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
        box mybox1=new box(10,20,15);
        box mybox2=new box(mybox1);
        double b=mybox1.volume();
         double a=mybox2.volume();
         System.out.println(a);
         System.out.println(b);
         //ewfwedwedwererferfer
    }
}