import java.io.*;
class LogicalOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a>b&&b<a);//false
        System.out.println(a>b||a<b);//true
    }
}