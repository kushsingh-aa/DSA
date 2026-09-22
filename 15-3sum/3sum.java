class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> set=new HashSet<>();
        // int n=nums.length;
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> newSet=Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(newSet);
        //                 set.add(newSet);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);
        
        
        
        int n=nums.length;
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left=i+1;
            int right=n-1;
            while(right>left){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }

                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }

                    right--;
                    left++;
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}