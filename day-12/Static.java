class Static {
    static int i = 100;
    static void method(){
        System.out.println("it si should be a defaut static inside");
    }
    // static void method(String Ename){
    //     System.out.println("it should be a inside the static code it will take a thye paramet's also in these one " + Ename);
    // }
    static{
        System.out.println("from the static methos");
    }
    public static void  main(String[] args){
        method();
    }
}