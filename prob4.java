//Given "abcabcbb", the answer is "abc", which the length is 3.

//Given "bbbbb", the answer is "b", with the length of 1.

//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
import java.util.*;
import java.util.Set.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int big=0,i=0;
        s=s.toLowerCase();
         HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        TreeSet<Integer> len=new TreeSet<Integer>();
        while(i<s.length())
        {
            if(letters.containsKey(s.charAt(i)))
            {
                int temp=i;
                i=(letters.get(s.charAt(i)))+1;
                letters.clear();
                letters.put(s.charAt(i),i);
                big=1;
                i++;
            }
            else
            {
                big++;
                letters.put(s.charAt(i),i);
                len.add(big);
                i++;
            }
        }
        if(!len.isEmpty())
            big=len.last();
        return big;
    }
}