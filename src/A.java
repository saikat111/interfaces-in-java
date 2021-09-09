interface A {
    void display();
    void print();
}
class Test implements A{
    public void display() {
        System.out.println("This is a display");
    }
    public void print() {
        System.out.println("This is a print");
    }
    public static void main(String args[]){
        Test test = new Test();
        test.display();
        test.print();
    }
}
/*class Main{
        public static void main(String args[]){
        Test test = new Test();
        test.display();
        test.print();
    }
}*/
