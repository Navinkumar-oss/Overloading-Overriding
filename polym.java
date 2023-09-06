// method overloading
// 1. same class 2. same method 
// 3. Different Argument ( a. no of arg. b. seq. of arg c. data type of arg)
class polym{
    void show(String a,int b )
    {
        System.out.println("method overloading");
    }
    public static void main(String[] args){
        polym P = new polym();
        P.show("A",20);
        P.show(10,"A");
        P.show("a"); // P.show(10);
    }
    void show(int a){
        System.out.println(" compile time polymorphism");
    }
    void show(int a,String b){
        System.out.println(" sequence of arg. is different");
    }
    void show(String b){
        System.out.println(" Data type  of arg. is different ");
    }
}