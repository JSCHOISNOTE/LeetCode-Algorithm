class Solution {
    public int romanToInt(String s) {
        String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] integers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        int answer = 0;

        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < romans.length; ++i){
            String roman = romans[i];
            int integer = integers[i];
            
            // 문자열이 현재 확인하는 Roman 길이보다 같거나 많아야 함
            while(sb.length() >= roman.length() && sb.substring(0, roman.length()).equals(roman)){
                answer += integer;
                sb.delete(0, roman.length());
            }
        }

        return answer;
    }
}