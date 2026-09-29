class Solution {
    void swap(int nums[], int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int left = low;
        int right = high;
        while (right > left) {
            while (left <= high - 1 && nums[left] <= pivot) {
                left++;
            }
            while (right >= low + 1 && nums[right] > pivot) {
                right--;
            }
            if (right > left)
                swap(nums, right, left);
        }
        swap(nums, low, right);
        return right;
    }

    void quicksort(int[] nums, int low, int high) {
        if (low < high) {
            int pIdx = partition(nums, low, high);
            quicksort(nums, low, pIdx - 1);
            quicksort(nums, pIdx + 1, high);
        }
    }

    public void sortColors(int[] nums) {
        quicksort(nums, 0, nums.length - 1);

    }
}