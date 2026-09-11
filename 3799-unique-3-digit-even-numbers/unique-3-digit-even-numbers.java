class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(digits[i]%2!=0){
                continue;
            }
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(digits[k]==0 || k==i || k==j){
                        continue;
                    }
                    set.add(digits[k]*100+digits[j]*10+digits[i]);
                }
            }
        }
        return set.size();
    }
}