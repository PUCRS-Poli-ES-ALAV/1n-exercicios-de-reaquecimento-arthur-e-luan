package ex1;
public class ex5 {
    public static void main (String []args){
        System.out.println(funcaoRecursiva(3));
    }
    private static int funcaoRecursiva(int x){
        if(x==1){
            return 1;
        }else if(x==2){
            return 2;
        }
        else{
            return (2*funcaoRecursiva(x-1)+3*funcaoRecursiva(x-2));
        }
    }
}
