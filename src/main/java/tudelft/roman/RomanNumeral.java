package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static final Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {

        int convertedNumber = 0;
        for(int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            System.out.println(currentNumber);
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;
            System.out.println(next);
            if(currentNumber < next) {
                convertedNumber -= currentNumber;
                System.out.println(convertedNumber);
            }
            else {
                convertedNumber += currentNumber;
                System.out.println(convertedNumber);
            }
        }

        return convertedNumber;

    }
}
