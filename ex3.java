package ex1;

public class ex3 {
    public static void main(String[]args){
        System.out.println(funcaoRecursiva(2));
    }
    public static double funcaoRecursiva(double x){
        if(x==1){
            return 1;
        }else{
            return 1/x+funcaoRecursiva(x-1);
        }
    }
}
