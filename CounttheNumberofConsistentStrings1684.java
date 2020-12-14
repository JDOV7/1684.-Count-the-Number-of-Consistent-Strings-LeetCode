package leetcode;

public class CounttheNumberofConsistentStrings1684 {

    public void CounttheNumberofConsistentStrings1684() {
        String allowed = "cad";
        String[] words = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        int iContValid = 0;
        for (int i = 0; i < words.length; i++) {
            boolean bControl = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (allowed.indexOf(words[i].charAt(j)) == -1) {
                    bControl = false;
                    break;
                }
            }
            if (bControl) {
                iContValid++;
            }
        }
        System.out.println(iContValid);
    }
}
