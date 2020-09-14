import java.util.*;

public class Mommifier {
    public String changedStringsAccordingVowels(String s) {
        List<String> tempStringList = new ArrayList<>();
        Set<Character> vowelsSet = getVowelsSet();
        if (judgePercentageOfVowelsOver30(s)) {
            for (int i = 0; i < s.length(); i++) {
                char curChar = s.charAt(i);
                tempStringList.add(String.valueOf(curChar));
                if (i < s.length() - 1 && vowelsSet.contains(curChar) && curChar == s.charAt(i + 1)) {
                    tempStringList.add("mommy");
                }
            }
            StringBuilder sb = new StringBuilder();
            tempStringList.stream().forEach(i -> {
                sb.append(i);
            });
            return sb.toString();
        }
        return s;
    }

    public boolean judgePercentageOfVowelsOver30(String s) {
        int vowelsCounts = 0;
        char[] sToChars = s.toCharArray();
        for (char c : sToChars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCounts++;
            }
        }
        return (double) vowelsCounts / (double) s.length() > 0.30d;
    }

    public Set<Character> getVowelsSet() {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        return set;
    }

}
