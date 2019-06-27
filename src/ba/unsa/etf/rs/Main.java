
package ba.unsa.etf.rs;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.Arrays.sort;


public class Main {

    public static Integer SumOfDigits (Integer number) {
        int sum =0;
        while (number != 0) {
            sum = sum + number % 10;
            number =  number / 10;
        }
        return sum;
    }

    static void Ispisi (Function<Double, Double> f) {
        for (int i=1; i<= 25; i++)
            System.out.println(f.apply((double)i));
    }


    public static void main(String[] args) {
	// write your code here
        double a,b,c;
        System.out.println("Input the coefficients of a quadratic equations, a ,b ,c");
        Scanner ulaz = new Scanner(System.in);
       /* a = ulaz.nextDouble(); b = ulaz.nextDouble(); c = ulaz.nextDouble();
        Function<Double, Double> lambda = x -> {return a * x * x + b * x + c;};
        Ispisi(lambda);*/

        System.out.print("How many nummbers do you wanna input? ");
        int n;
        n = ulaz.nextInt();
        Integer[] niz = new Integer[n];
        for (int i=0; i<n; i++)
            niz[i] = ulaz.nextInt();

        System.out.print("Unsorted array: ");
        for (var x : niz)
            System.out.print(x+" ");

        Integer[] niz2 = niz.clone();
        ;
        // Sorting using lamda functions
        System.out.println("\nSorted array using sort and lamda function: ");
        sort(niz, (n1,n2) ->  SumOfDigits(n1) - SumOfDigits(n2));
        for (var x : niz)
            System.out.print(x + " ");

        // Sorting using java strstreams
        System.out.println("\nSorted array using java streams: ");
        Stream.of(niz2).sorted( (n1,n2) -> SumOfDigits(n1) - SumOfDigits(n2)).forEach(x -> System.out.print(x+" "));








    }
}

