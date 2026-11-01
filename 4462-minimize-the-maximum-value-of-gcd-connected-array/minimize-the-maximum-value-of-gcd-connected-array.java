// class Solution {
//     public long gcd(long a,long b){
//         while(b!=0){
//             long temp=b;
//             b=a%b;
//             a=temp;
//         }
//         return a;
//     }
//     public long minimumMaxValue(int n, int index, int value) {
//         long []nums=new long[n];
//         nums[index]=value;
//         for(int i=index-1;i>=0;i--){
//             long next=nums[i+1];
//             long cur=next-1;
//             while(cur>0 && gcd(cur,next)==1){
//                 cur--;
//             }
//             if(cur<=0) return -1;
//             nums[i]=cur;
//         }

//         for(int i=index+1;i<n;i++){
//             long prev=nums[i-1];
//             long cur=prev+1;
//             while(gcd(cur,prev)==1) cur++;
//             nums[i]=cur;
//         }
//         return nums[n-1];
//     }
// }


class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        int spf=value;
        for(int i=2;i*i<=value;i++){
            if(value%i==0){
                spf=i;
                break;
            }
        }

        if(index>0){
            long remaining;
            if(value%2==0) remaining=(long)value-2*index;
            else remaining=(long)value-spf-2*(index-1);
            if(remaining<=0) return -1;
        }

        int right=n-1-index;
        long ans=value;
        if(right>0){
            if(value==1) return -1;
            ans=(long)value+spf+2*(right-1);
        }
        return ans;
    }
}