package ex1;
import java.util.Arrays;

public class ex4 {
    public static void main (String[]args){
        System.out.println(funcaoRecursiva("bom dia"));
    }
    private static String funcaoRecursiva(String x){
        if((x.length())==1){
            return x;
        }else{
            char[] y = x.toCharArray();
            char[] z = new char[y.length];
            char[] novoArray = new char[z.length - 1];

        
        for (int i = 0; i < y.length - 1; i++) {
            novoArray[i] = y[i];
        }
            z[1] = y[y.length - 1];
            return new String(z)+funcaoRecursiva(new String(novoArray));
        }
    }
}
