class Solution {

    public String sort(String s){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String newStr=new String(arr);
        return newStr;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            String word=sort(strs[i]);
            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }
            map.get(word).add(strs[i]);
        }
        List<List<String>> result=new ArrayList<>();
        for(String key:map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
}