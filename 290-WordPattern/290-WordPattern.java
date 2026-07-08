// Last updated: 7/8/2026, 3:40:33 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        char[] p=pattern.toCharArray();
        String[] val=s.split(" ");
        if (p.length != val.length) return false;
        for(int i=0;i<p.length;i++){
            if (map.containsKey(p[i])) {
                if (!val[i].equals(map.get(p[i])))
                    return false;
                
            } else {
                
                if (map.containsValue(val[i])) return false;
                
                map.put(p[i], val[i]);
            }
        }

        return true;


        
    }
}