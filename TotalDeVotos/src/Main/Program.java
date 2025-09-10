package Main;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\logicaDeProgramacao\\TotalDeVotos\\in.txt");
        Scanner sc = null;

        Map<String, Integer> voteMap = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if(voteMap.containsKey(name)) {
                    voteMap.compute(name, (k, votesSoFar) -> count + votesSoFar);
                } else {
                    voteMap.put(name, count);
                }

                line = br.readLine();
            }
            for (String key : voteMap.keySet()) {
                System.out.println(key + " with: " + voteMap.get(key) + " votes");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
