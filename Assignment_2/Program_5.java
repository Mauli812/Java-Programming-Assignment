
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
public class Program_5 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("C:\\Users\\SIS\\Documents\\aayushijava\\src\\Assignment_2\\aayushi.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String words[] = line.split(" ");

                for (String word : words) {

                    word = word.toLowerCase();

                    if (map.containsKey(word)) {

                        map.put(word,
                                map.get(word) + 1);

                    } else {

                        map.put(word, 1);
                    }
                }
            }

            br.close();

            System.out.println("Word Count:");

            for (String word : map.keySet()) {

                System.out.println(word + " : "
                        + map.get(word));
            }

        } catch (Exception e) {

            System.out.println("File not found");
        }
    }
}