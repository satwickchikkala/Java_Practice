class Main{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;

        a=b;
        b=c;
        c=b-a;
        System.out.println("a : " + a + " b : " + b + " c : " + c);
    }

}