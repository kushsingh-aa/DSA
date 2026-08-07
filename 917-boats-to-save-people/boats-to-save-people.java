class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cnt=0,l=0,r=people.length-1;
        while(r>=l){
            if(people[l]+people[r]<=limit){
                l++;
            }
            r--;
            cnt++;
        }
        return cnt;
    }
}