package testpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestPractice {

    public static void main(String[] args) {
        int[] a = {5, 4, 2, 4, 9, 1};
        Arrays.sort(a);  //进行排序   
        
        List<Integer> tree = new ArrayList<>();
        tree.add(5);
        tree.add(4);
        tree.add(2);
        tree.add(4);
        tree.add(9);
        tree.add(1);
        Collections.sort(tree);
        for (int i : tree) {
            System.out.print(i);
        }
    }
}
