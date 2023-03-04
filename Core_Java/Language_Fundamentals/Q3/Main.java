package Q3;

import java.io.*;

public class Main {
    public static String classifyEarthquake(double magnitude) {
        if (magnitude <= 2.4) {
            return "Micro";
        } else if (magnitude <= 5.4) {
            return "Light";
        } else if (magnitude <= 6.0) {
            return "Moderate";
        } else if (magnitude <= 6.9) {
            return "Strong";
        } else if (magnitude <= 7.9) {
            return "Major";
        } else {
            return "Great";
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Richter Magnitude: ");
        double magnitude = Double.parseDouble(br.readLine());

        System.out.println(classifyEarthquake(magnitude));
    }
}
