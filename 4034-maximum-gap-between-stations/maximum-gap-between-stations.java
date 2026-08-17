class Solution {
    public int maximumGap(String skill, String station) {
        int n=skill.length();
        int m=station.length();
        int[] front=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            while(station.charAt(j)!=skill.charAt(i)){
                j++;
            }
            front[i]=j;
            j++;
        }
        int[] back=new int[n];
        j=m-1;
        for(int i=n-1;i>=0;i--){
            while(station.charAt(j)!=skill.charAt(i)){
                j--;
            }
            back[i]=j;
            j--;
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            ans=Math.max(ans,back[i+1]-front[i]);
        }
        return ans;
    }
}