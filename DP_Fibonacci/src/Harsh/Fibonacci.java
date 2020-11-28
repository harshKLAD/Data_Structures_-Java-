package Harsh;
import java.util.HashMap;

public class Fibonacci {



    public static int fib(int x){
        if(x < 2){
            return x;
        }else{
            calcs++;
            return fib(x - 2) + fib(x - 1);
        }
    }

    public static HashMap<Integer, Integer> DP_memory = new HashMap<Integer, Integer>();
    public static int calcs = 0;
    public static int calcs_DP = 0;

    public static int fib_DP(int x){
        if(DP_memory.containsKey(x)){
            return DP_memory.get(x);
        }else{
            calcs_DP++;
            if(x < 2){
                return x;
            }else {
                int out = fib_DP(x - 2 ) + fib_DP(x - 1 );
                DP_memory.put( x , fib_DP(x - 2 ) + fib_DP(x - 1 ));
                return out;
            }
        }
    }


    public static void main(String[] args) {
        int x = 15;
        System.out.println(calcs);
        System.out.println(calcs_DP);
        System.out.println();
	    fib(x);
        System.out.println(calcs);
        fib_DP(x);
        System.out.println(calcs_DP);
    }
}
