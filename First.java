public class First {
    int a;
    static void unusedMethod(int a) {
        System.out.println("Checkstyle test : "+a);
    }

    void anotherUnusedMethod(int b, int c) {
        System.out.println("This method will be called by using object created in main method");
        System.out.println("Values of b and c are : "+b+" and "+c);
    }

    static void Numbers(int num1, int num2) {
        System.out.println("The numbers from "+num1+" to "+num2+" are :");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i+" ");
        }
        
    }

    static void method(){     //For printing sum of array elements, written by myself
        int sum=0;
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        for (int i=0;i<arr.length;i++){
      //  System.out.println(i);
        sum=sum+arr[i];
       // System.out.println(sum);
        }
        System.out.println("  ");
        System.out.println(sum);
    }

//test comment
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        First obj = new First();
        obj.anotherUnusedMethod(2, 3);
        unusedMethod(1);
        Numbers(1, 100);
        method();
    }
}
