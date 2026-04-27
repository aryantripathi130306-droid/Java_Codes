interface i1{
abstract void show();
}
interface i2{
    abstract void display();
}
interface i3{
    abstract void print();
}
class myclass implements i1,i2,i3{
    public void show(){
        System.out.println("This is show method");
    }
    public void display(){
        System.out.println("This is display method");   
    }
    public void print(){
        System.out.println("This is print method");
    }
}
public class Interface_Example {
    public static void main(String[] args) {
        myclass obj = new myclass();
        obj.show();
        obj.display();
        obj.print();
    }
}     
            