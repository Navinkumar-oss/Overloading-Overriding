//overriding 
// 1. same name 2. different class 3. same argument 4. Inheritance (IS-A)
class overriding {
    void show(){
        System.out.println("Run time polymorphism");
    }
    public static void main(String[] args){
        overriding O = new overriding();
        O.show();
        Test t= new Test();
        t.show();
    }
}
class Test extends overriding {
    void show(){
        System.out.println("Overriding");
    }
}