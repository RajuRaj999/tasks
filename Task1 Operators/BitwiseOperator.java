import java.io.*;
class BitwiseOperator {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println(a^b);//1
        System.out.println(a>b&b<a);//false
        System.out.println(a>b|a<b);//true
    }
}