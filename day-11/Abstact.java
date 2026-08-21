abstract class Emp {
    void display(){
        System.out.println("From Emp class");
    }
}
class Abstact {
    public static void main(String[] args){
        Emp e = new Emp();
        e.display();
    }
}
