import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ArraySuma {

    public static int simpleArraySum(List<Integer> ar) {

        List<Integer> results = new ArrayList<Integer>();

        int suma = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) > 0) {
                suma++;

            }

        }
        results.add(suma);
        return results;
    }

}
