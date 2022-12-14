// Additional tasks
// Collect Task 12

package org.Java_labs.Additional_tasks;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class Task12 {
    public static void main(String[] args) {
		HashMap<Integer, Double> coefficients = new HashMap<>();
        List<Double> polynomial1 = Arrays.asList(7.0, -15.25, 0.0, 13.3, -3.0, 0.0, 1.0);
        List<Double> polynomial2 = Arrays.asList(17.34, -11.11, 0.0, -5.0, 12.1);
        for (int i = 0; i < polynomial1.size(); ++i) {
            for (int j = 0; j < polynomial2.size(); ++j) {
                double new_value = polynomial1.get(i) * polynomial2.get(j);
                if (coefficients.containsKey(i + j)) {
                    double curr_value = coefficients.get(i + j);
                    coefficients.put(i + j, new_value + curr_value);
                } else {
                    coefficients.put(i + j, new_value);
                }
            }
        }
        for (int i = 0; i < coefficients.size(); ++i) {
            if (i == coefficients.size() - 1) {
                System.out.printf("%.2f*x^%d ", coefficients.get(i), i);
            } else if ((i != coefficients.size() - 1) && (coefficients.get(i + 1) < 0)) {
                System.out.printf("%.2f*x^%d ", coefficients.get(i), i);
            } else {
                System.out.printf("%.2f*x^%d + ", coefficients.get(i), i);
            }
        }
    }
}