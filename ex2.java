package ex1;
public class ex2 {
    public static void main (String[]args){

        System.out.println(funcaoRecursiva(3, 2));;
    }
    private static int funcaoRecursiva(int x, int y){
        if(x==0){
            return y;
        }else {
            return funcaoRecursiva(x-1, y+1);
        }

    }
}
