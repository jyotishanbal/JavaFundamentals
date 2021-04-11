public class HelloWorld{


public void display(){
    System.out.println("Function Called");
}

public HelloWorld(){
System.out.println("Default Constructor Called");
}

public HelloWorld(String s){
    s = "Jyoti";
    System.out.println("Constructor1");
    System.out.println(s);
}

public HelloWorld(int d){
    d = 10;    
    System.out.println(d);
}

    public static void main (String[] args) {
    HelloWorld h = new HelloWorld("Parameterized Constructor");
    HelloWorld h1 = new HelloWorld();
    HelloWorld h2 = new HelloWorld(20);
    h.display();

}

}