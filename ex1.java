package ex1;


public class ex1{
    public static void main(String[]args){
        System.out.println(funcaoRecursiva(6, 4));
    }
    private static int funcaoRecursiva(int vezes, int numero){
        int total=0;
        if(vezes!=0){
            total=funcaoRecursiva(vezes-1, numero)+numero;
        }

        return total;
    }
}