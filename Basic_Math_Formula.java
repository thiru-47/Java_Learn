import java.util.Scanner;
public class Basic_Math_Formula {
    void Area_Circle(int r){
        System.out.println("The area of the circle is "+r*r*Math.PI);
    }

    void Area_Triangle(int b, int h){
        System.out.println("The area of the Triangle is "+ 0.5*b*h);
    }
    void Area_Rectangle(int length, int breadth){
        System.out.println("The area of the rectangle is "+length*breadth);
    }
    void Area_Rhombus(int d1,int d2){
        System.out.println("The area of the Rhombus is "+ (d1*d2)/2);
    }
    static double Area_EquilateralTriangle(int side) {
        return (Math.sqrt(3) / 4) * side * side;
    }
    static double Perimeter_Circle(int radius){
        return (2 * Math.PI * radius);
    }
    static double Volume_Cone(double rad,double hght){
        return (Math.pow(rad,2)*Math.PI*hght);
    }
    static double Volume_Sphere(double sphere_radius){
        return (Math.pow(sphere_radius,2)*Math.PI);
    }
    static double CSA_Cylinder(double cylinder_radius,double cylinder_height){
        return (2*Math.PI*cylinder_radius*cylinder_height);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Basic_Math_Formula a = new Basic_Math_Formula();
        int choice;
System.out.println("=====PLEASE ENSURE THAT THE UNIT OF TWO PARAMETERS(if required) IS SAME=====");
        System.out.println("\n---- MENU ----");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Triangle");
        System.out.println("3. Area of Rectangle");
        System.out.println("4. Area of Rhombus");
        System.out.println("5. Area of Equilateral Triangle");
        System.out.println("6. Perimeter of Circle");
        System.out.println("7. Volume of Cone");
        System.out.println("8. Volume of Sphere");
        System.out.println("9. CSA of Cylinder");
        System.out.println("10. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the Radius of the circle:");
                int r=sc.nextInt();
                a.Area_Circle(r);
                break;
            case 2:
                System.out.println("Enter the Height of the Triangle:");
                int h = sc.nextInt();
                System.out.println("Enter the Base of the Triangle:");
                int b=sc.nextInt();
                a.Area_Triangle(h,b);
                break;
            case 3:
                System.out.println("Enter the Length of the Rectanglr:");
                int length = sc.nextInt();
                System.out.println("Enter the Breadth of the Rectangle:");
                int breadth = sc.nextInt();
                a.Area_Rectangle(length,breadth);
                break;
            case 4:
                System.out.println("Enter the 1st Diameter of the Rhombus:");
                int d1 = sc.nextInt();
                System.out.println("Enter the Second Diameter of the Rhombus:");
                int d2 = sc.nextInt();
                a.Area_Rhombus(d1,d2);
                break;
            case 5:
                System.out.println("Enter the Value of Edge of the Triangle:");
                int side=sc.nextInt();
                System.out.println("The of Equilateral Triangle of side "+side+" is "+(Area_EquilateralTriangle(side)));
                break;
            case 6:
                System.out.println("Enter the Radius of the Circle:");
                int radius=sc.nextInt();
                System.out.println("The Perimeter of Circle is "+(Perimeter_Circle(radius)));
                break;
            case 7:
                System.out.println("Enter the Radius of the Base of Cone:");
                double rad=sc.nextDouble();
                System.out.println("Enter the Height of the Cone:");
                double hght=sc.nextDouble();
                System.out.println("The Volume of Cone is "+(Volume_Cone(rad,hght)));
                break;
            case 8:
                System.out.println("Enter the Radius of the Sphere:");
                double sphere_radius=sc.nextDouble();
                System.out.println("The Volume of the Sphere is :"+(Volume_Sphere(sphere_radius)));
                break;
            case 9:
                System.out.println("Radius of the Cylinder:");
                double cylinder_radius=sc.nextDouble();
                System.out.println("Enter the Height of the Cylinder:");
                double cylinder_height=sc.nextDouble();
                System.out.println("The CSA of Cylinder is: "+CSA_Cylinder(cylinder_radius,cylinder_height));
                break;
            default:
                System.out.println("Invalid Input. Please Enter Correct Input.😊");
                        }
                        sc.close();
    }
}
