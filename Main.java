public class Main {
    int a;
    static void unusedMethod(int a) {
        System.out.println("Checkstyle test : "+a);
    }

    void anotherUnusedMethod(int b, int c) {
        System.out.println("This method will be called by using object created in main method");
        System.out.println("Values of b and c are : "+b+" and "+c);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Main obj = new Main();
        obj.anotherUnusedMethod(2, 3);
        unusedMethod(1);
    }
}
