import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Counters :");
        int numCounters = scanner.nextInt();
        scanner.nextLine();

        FrequencyCounterThread[] threads = new FrequencyCounterThread[numCounters];

        for (int i = 0; i < numCounters; i++) {
            System.out.println("Enter text for counter " + (i + 1) + " :");
            String text = scanner.nextLine();
            threads[i] = new FrequencyCounterThread(text);
            threads[i].start();
        }

        for (int i = 0; i < numCounters; i++) {
            try {
                threads[i].join();
                System.out.println("Counter " + (i + 1) + " Result :");
                System.out.println(threads[i].getCharacterFrequency());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class FrequencyCounterThread extends Thread {
    private String text;
    private String characterFrequency;

    public FrequencyCounterThread(String text) {
        this.text = text;
        this.characterFrequency = "";
    }

    public void run() {
        int[] count = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            count[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                char ch = (char) i;
                characterFrequency += ch + ":" + count[i] + " ";
            }
        }
    }

    public String getCharacterFrequency() {
        return characterFrequency;
    }
}
