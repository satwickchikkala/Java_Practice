final class Emp {
    int eno;
    String ename;
    void input(){
        eno = 1001;
        ename = "*XYZ";
    }
    void display(){
        System.out.println("Emp no :- " + eno);
        System.out.println("Emp Name :- "+ename);
    }
}
class Final {
    public static void main(String[] args){
        Emp e = new Emp();
        e.input();
        e.display();
    }
}