
class Base {
    int a,b;
    Base(){
        a=0;
        b=0;
    }
    Base(int a, int b){
        this.a = a;
        this.b = b;
    }
}
 
// Inherited or Sub Class
class Sub extends Base {

    Sub(){
        super();
        
    }
    Sub(int a, int b) {
        // Invoking the parameterized constructor of the Base class using super
        super(a, b);
    }
    void add()
    {
        System.out.println("Sum is : "+(a+b));
    }
    
}
 
// Driver Class
class Inherit {
    public static void main(String args[])
    {
        Sub E1 = new Sub();
      //  E1.Base(12,45);
        E1.add();
    }
}