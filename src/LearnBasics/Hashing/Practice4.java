package LearnBasics.Hashing;

import java.util.HashMap;

public class Practice4 {
    public static void main(String[] args){
        String a = "Java is easy java is powerful";
        String[] words = a.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            String w = words[i].toLowerCase();
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        for(String key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}