class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }
        Map<Character, Integer> compteurS = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char lettre = s.charAt(i);
            compteurS.put(lettre, compteurS.getOrDefault(lettre, 0) + 1);
            
        }

        Map<Character, Integer> compteurT = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char lettre = t.charAt(i);
            compteurT.put(lettre, compteurT.getOrDefault(lettre, 0) + 1);
            
        }

        return compteurS.equals(compteurT);
    
    }
}
