class Poly{
    void add(int a, int b)
    {
        System.out.println("Sum : "+(a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("Sum : "+(a+b+c));
    }

    public static void main(String[] args) {
        Poly ob = new Poly();
        ob.add(23,45);
        ob.add(24,56,87);
    }
}