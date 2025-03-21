class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int p = 0;
        int[] r = new int[m];
        if (m != 0) {
            System.arraycopy(nums1, 0, r, 0, m);

        }

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            i = m + n;
        } else if (n == 0) {
           
        } else {
            while (i < m && j < n) {
                if (r[i] > nums2[j]) {
                    nums1[p++] = nums2[j++];
                } else {
                    nums1[p++] = r[i++];
                }
            }

            
            while (j < n) {
                nums1[p++] = nums2[j++];
            }

            
            while (i < m) {
                nums1[p++] = r[i++];
            }
        }

    }
}