class Solution {
    public int sum(int num){
        int s=0;
        while(num>0){
            s+=num%10;
            num/=10;
        }
        return s;
    }
    public int minSwaps(int[] nums) {
        int n=nums.length;
        Integer[] index=new Integer[n];
        for(int i=0;i<n;i++){
            index[i]=i;
        }

        Arrays.sort(index,(a,b) -> {
            int sumA=sum(nums[a]);
            int sumB=sum(nums[b]);
            if(sumA!=sumB){
                return Integer.compare(sumA,sumB);
            }else{
                return Integer.compare(nums[a],nums[b]);
            }
        });

        boolean[] visited=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(visited[i] || index[i]==i){
                continue;
            }
            int size=0;
            int cur=i;
            while(!visited[cur]){
                visited[cur]=true;
                cur=index[cur];
                size++;
            }
            if(size>1){
                ans+=(size-1);
            }
        }
        return ans;
    }
}