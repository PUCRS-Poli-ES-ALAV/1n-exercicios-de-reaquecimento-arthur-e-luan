package ex1;

public class ex6 {
    public static void main(String[]args){

        System.out.println(funcaoRecursiva(3, 3));
    }
    public static int funcaoRecursiva(int m, int n){
        if(m==0){
            return n+1;
        }else if(m!=0 && n==0){
            return funcaoRecursiva(m-1, 1);
        } else{
            return funcaoRecursiva(m-1, funcaoRecursiva(m, n-1));
        }
    }
}
