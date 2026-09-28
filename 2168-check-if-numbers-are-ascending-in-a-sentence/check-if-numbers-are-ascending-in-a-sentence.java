class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = -1;
        String[] string = s.split(" ");
        for (String a : string) {
            if (Character.isDigit(a.charAt(0))) {
                int cur = Integer.parseInt(a);
                if (prev >= cur) {
                    return false;
                }
                prev = cur;
            }
        }
        return true;
    }
}