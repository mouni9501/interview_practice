import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SumOfMostFrequentVowelAndConsonant {
    public static void main(String[] args){
        String s = "aeiaeia";
       int finalSum =  sumOfMostFrequentVowelAndConsonant(s);
        System.out.println("Final result is : "+finalSum);
    }
    public static int sumOfMostFrequentVowelAndConsonant(String s){
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int[] vowelsFrequency = new int[5];
        int[] consonantsFrequency = new int[21];
        int vowelsIndex = 0;
        int consonantsIndex = 0;
        char[] ch = s.toCharArray();
        for (char c : ch) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character,Integer> eachPair:hm.entrySet()){
            System.out.println(eachPair.getKey()+" "+eachPair.getValue());
            if(eachPair.getKey()=='a'||eachPair.getKey()=='e'||
                eachPair.getKey()=='i'||eachPair.getKey()=='o'||eachPair.getKey()=='u'){
                vowelsFrequency[vowelsIndex] = eachPair.getValue();
                vowelsIndex++;
            }else{
                consonantsFrequency[consonantsIndex] = eachPair.getValue();
                consonantsIndex++;
            }
        }
        for(int i=0;i<vowelsFrequency.length;i++){
            for(int j=i+1;j<=vowelsFrequency.length-1;j++){
                if(vowelsFrequency[i]<vowelsFrequency[j]){
                    int temp = vowelsFrequency[i];
                    vowelsFrequency[i] = vowelsFrequency[j];
                    vowelsFrequency[j] = temp;
                }
            }
        }
        int vowelMaxFreCount = vowelsFrequency[0];
        System.out.println("Vowel max freq count: "+vowelMaxFreCount);

        for(int i=0;i<consonantsFrequency.length;i++){
            for(int j=i+1;j<=consonantsFrequency.length-1;j++){
                if(consonantsFrequency[i]<consonantsFrequency[j]){
                    int temp = consonantsFrequency[i];
                    consonantsFrequency[i] = consonantsFrequency[j];
                    consonantsFrequency[j] = temp;
                }
            }
        }
        int consMaxFreCount = consonantsFrequency[0];
        System.out.println("Consonants max freq count: "+consMaxFreCount);

        return vowelMaxFreCount+consMaxFreCount;
    }
}
