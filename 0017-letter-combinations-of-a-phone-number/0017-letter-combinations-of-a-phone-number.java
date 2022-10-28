// 재귀적방법
class Solution {
  private static final String[] mapping = new String[]{"", "", "abc", "def", 
                                                       "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
      List<String> ret = new ArrayList<>();
      if(digits.length() == 0) return ret;
      combination("", digits, 0, ret);
      return ret;
    }

    public void combination(String prefix, String digits, int offset, List<String> ret){
      if(offset >= digits.length()){
        ret.add(prefix);
        return;
      }
      String letters = mapping[digits.charAt(offset) - '0'];
      for(int i=0; i < letters.length(); i++){
        combination(prefix+letters.charAt(i), digits, offset+1, ret);
      }
    }
}