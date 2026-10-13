class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }

        Arrays.sort(arr);
        long score=0;
        int half=nums.length/2;
        for(int i=0;i<half;i++){
            score-=arr[i];
        }
        for(int i=half;i<nums.length;i++){
            score+=arr[i];
        }
        return (long)score;
    }
}