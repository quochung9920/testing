import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNext()){
            int resultado;
            int x= sc.nextInt();
            int y = sc.nextInt();
            resultado = x/y;
            System.out.println(resultado);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
    }
}