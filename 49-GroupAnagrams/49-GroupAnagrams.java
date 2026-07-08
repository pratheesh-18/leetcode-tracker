// Last updated: 7/8/2026, 3:43:00 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String ,List<String>> map=new HashMap<>();
        
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);

        }

        return new ArrayList<>(map.values());
        
    }
}