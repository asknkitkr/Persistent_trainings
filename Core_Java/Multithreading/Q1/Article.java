package Multithreading.Q1;

public class Article extends Thread {
    public String line;
    public Integer count;

    public Article() {
    }

    public Article(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void run() {
        String[] words = line.split("\\s+");
        count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase("a") || word.equalsIgnoreCase("an") || word.equalsIgnoreCase("the")) {
                count++;
            }
        }
    }

}
