class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        Map<Character, Integer> mapS1 = new HashMap<>();
        Map<Character, Integer> mapS2 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            mapS1.put(s1.charAt(i), mapS1.getOrDefault(s1.charAt(i),0)+1);
            mapS2.put(s2.charAt(i), mapS2.getOrDefault(s2.charAt(i),0)+1);
        }

        if(mapS1.equals(mapS2)) return true;

        int left = 0;
        for(int right=s1.length();right<s2.length();right++){
            char r = s2.charAt(right);
            mapS2.put(r,mapS2.getOrDefault(r,0)+1);

            char l = s2.charAt(left);
            mapS2.put(l,mapS2.get(l)-1);
            if(mapS2.get(l)==0) mapS2.remove(l);
            left++;
            if(mapS1.equals(mapS2)) return true;
        }
        return false;
    }
}