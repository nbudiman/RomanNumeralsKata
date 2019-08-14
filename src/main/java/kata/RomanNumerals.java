package kata;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {

    private List<Pair<String, Integer>> symbolNumberMap;

    public RomanNumerals() {
        this.symbolNumberMap = new ArrayList<>();
        this.symbolNumberMap.add(new Pair<>("C", 100));
        this.symbolNumberMap.add(new Pair<>("XC", 90));
        this.symbolNumberMap.add(new Pair<>("L", 50));
        this.symbolNumberMap.add(new Pair<>("XL", 40));
        this.symbolNumberMap.add(new Pair<>("X", 10));
        this.symbolNumberMap.add(new Pair<>("IX", 9));
        this.symbolNumberMap.add(new Pair<>("V", 5));
        this.symbolNumberMap.add(new Pair<>("IV", 4));
        this.symbolNumberMap.add(new Pair<>("I", 1));
    }

    public String digit(String symbol, int num, int divisor) {
        String romanNum = "";
        int quotient = num / divisor ;

        for (int i = 0; i < quotient; i++) {
            romanNum += symbol;
        }

        return romanNum;
    }


    public String convert(int arabicNum) {
        String romanNum = "";

        for (int i = 0; i < symbolNumberMap.size(); i++) {
            Pair<String, Integer> symbolValuePair = symbolNumberMap.get(i);
            romanNum += digit(symbolValuePair.getKey(), arabicNum, symbolValuePair.getValue());
            arabicNum = arabicNum % symbolValuePair.getValue();
        }

        return romanNum;
    }

}