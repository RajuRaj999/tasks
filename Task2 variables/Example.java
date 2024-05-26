/*variables:A variable is a container which holds the value with data type
types of variables:
1.static variable
2.instance variable
3.local variable

static variable:A variable that is declared as static is called a static variable.  A variable declared inside the class but outside the body of the method
instace variable:A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.
local variable:A variable declared inside the body of the method is called local variable.

*/

class Example {
    static int x=23;// static variable
    int y=34;//instance varable
    void man(int x){
        Example.x=24;
        this.x=33;
        System.out.println(Example.x);
        System.out.println(x);
    }
    public static void main(String[] args) {
        Example o=new Example();
         o.x=56;
        int y=45;//local variable
        System.out.println(Example.x);
         System.out.println(o.x);
        System.out.println(y);
        o.man(1);
    }
}