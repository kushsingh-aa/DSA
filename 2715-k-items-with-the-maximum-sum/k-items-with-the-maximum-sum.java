class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;
        else if(k<=numOnes+numZeros) return numOnes;
        int extraK=k-(numOnes+numZeros);
        return numOnes-extraK;
    }
}