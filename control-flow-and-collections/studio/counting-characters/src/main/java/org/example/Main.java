import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a good long sentence: ");
        String sentence = input.nextLine();
        char[] charactersInString = sentence.toLowerCase().toCharArray();
        //System.out.println(charactersInString);

        HashMap<Character, Integer> map = new HashMap<>();
        for(char character:charactersInString) {
            Integer count = map.get(character);
            if (String.valueOf(character).matches("[a-zA-Z]+")) {
                if (map.containsKey(character)) {
                    map.put(character, count + 1);
                } else {
                    map.put(character, 1);
                }
            }
        }
        //System.out.println(map);
        for(Map.Entry<Character,Integer> word: map.entrySet()){
            System.out.println(word.getKey()+":"+word.getValue());
        }
    }

}