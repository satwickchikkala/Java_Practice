class swappingthree 
{
    public static void main ( String args []) {
        int a = 5;
        int b = 10;
        int c = 15;
        c = c-b;//5
        b = a+b;//15
        a = b-c;//5
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
        System.out.println("c is :"+c);
    }
}