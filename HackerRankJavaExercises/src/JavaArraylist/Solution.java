package JavaArraylist;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (Scanner n = new Scanner(System.in)) {
            int N = n.nextInt();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int d = n.nextInt();
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < d; j++) {
                    row.add(n.nextInt());
                }
                list.add(row);
            }
            // to test
            // for (ArrayList<Integer> l : list) {
            // for (Integer num : l) {

            // System.out.print(num + " ");
            // }
            // System.out.println();
            // }

            int Q = n.nextInt();
            for (int i = 0; i < Q; i++) {
                int x = n.nextInt();
                int y = n.nextInt();
                try {
                    System.out.println(list.get(x - 1).get(y - 1));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}
