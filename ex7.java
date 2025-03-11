package ex1;

public class ex7 {
    public static void main(String []args){
        int vetor[] = {2, 3, 6, 5};
        System.out.println("produto:"+ funcaoRecursivaProduto(vetor, 1));
        System.out.println("soma:"+ funcaoRecursivaSoma(vetor, 1));
        
        
    }
    private static int funcaoRecursivaSoma(int [] x, int index){

        if(index==x.length){
            return 0;
        }
        return x[index]+funcaoRecursivaSoma(x, index+1);
    }
    private static int funcaoRecursivaProduto(int [] x, int index){
        if(index==x.length){
            return 1;
        }
        return x[index]*funcaoRecursivaProduto(x, index+1);
    }
}
