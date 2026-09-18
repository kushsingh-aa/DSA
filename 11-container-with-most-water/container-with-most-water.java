class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
        while(right>left){
            int h=Math.min(height[left],height[right]);
            max=Math.max(max,h*(right-left));
            if(height[right]>height[left]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}