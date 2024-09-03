
public class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
            int totalLength = m + n;
            int median = totalLength / 2;
            int i = 0, j = 0, current = 0, previous = 0, count = 0;
            while (count <= median) {
                previous = current;
                if (i < n && (j >= m || nums1[i] <= nums2[j])) {
                    current = nums1[i];
                    ++i;
                } else {
                    current = nums2[j];
                    ++j;
                }
                ++count;
            }
            if (totalLength % 2 != 0) {
                return current;
            } else {
                return (previous + current) / 2.0;
            }
        }
        public static void main(String[] args) {
            Solution solution = new Solution();
            int nums1[] = {1, 3, 5, 7};
            int nums2[] = {2, 4, 6, 8};
            System.out.println("Solution is: " + solution.findMedianSortedArrays(nums1, nums2));
        }
}
