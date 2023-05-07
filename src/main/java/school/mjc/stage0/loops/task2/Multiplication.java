package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive > 0) {
            int ans = 0;
            for (int i = 0; i <= multiplyByAndToInclusive; i++) {
                System.out.println(ans);
                ans += multiplyByAndToInclusive;
            }
        } else if (multiplyByAndToInclusive < 0) {
            int ans = 0;
            for (int i = 0; i >= multiplyByAndToInclusive; i--) {
                System.out.println(ans);
                ans += multiplyByAndToInclusive;
            }
        }
    }
}
