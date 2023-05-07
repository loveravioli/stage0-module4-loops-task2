package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int ans = 1;
        for (int i = 0; i <= printToInclusive; i++) {
            if (i < 1) {
                System.out.println(1);
            } else {
                ans *= i;
                System.out.println(ans);
            }
        }
    }
}
