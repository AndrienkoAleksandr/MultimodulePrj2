package org.eclipse.che.examples;

import java.util.ArrayList;
import java.util.List;

public class ClassUtils {
    public static long fibonacci(int i) {
        if (i == 0)
            return 0;
        if (i <= 2)
            return 1;

        long fibTerm = fibonacci(i - 1) + fibonacci(i - 2);
        return fibTerm;
    }
    
    public static List<Long> solveFibonacciSequence(int begin, int end) {
        List<Long> sequence = new ArrayList<Long>();
        for (int i = begin; i < end; i++) {
            sequence.add(fibonacci(i));
        }
        return sequence;
    }
}
