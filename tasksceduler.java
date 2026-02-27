import java.util.HashMap;

public class tasksceduler {

    static int leastInterval(char[] tasks, int n) {

        HashMap<Character, Integer> map = new HashMap<>();

       
        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        int maxFreq = 0;

        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int maxCount = 0;

        for (int freq : map.values()) {
            if (freq == maxFreq) {
                maxCount++;
            }
        }

        int partCount = maxFreq - 1;
        int partLength = n + 1;
        int emptySlotsFormula = partCount * partLength + maxCount;

        return Math.max(tasks.length, emptySlotsFormula);
    }

    public static void main(String[] args) {

        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;

        System.out.println(leastInterval(tasks, n));
    }
}