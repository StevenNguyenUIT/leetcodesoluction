package easy.romantointeger;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('M', 1000);
        roman.put('D', 500);
        roman.put('C', 100);
        roman.put('L', 50);
        roman.put('X', 10);
        roman.put('V', 5);
        roman.put('I', 1);
        int sum = 0;
        int current = roman.get(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            int value = roman.get(s.charAt(i));
            if(value>current){
                sum = sum + value - (current*2);
            } else {
                sum+=value;
            }
            current = value;
        }
        return sum;
    }

}
