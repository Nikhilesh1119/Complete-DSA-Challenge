class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1= nums1.length;
        int l2 = nums2.length;
        int i=0,j=0,k=0;
        int[] ans = new int[l1+l2];
        
        while(i<l1){
            ans[k] =nums1[i];
            i++;
            k++;
        }
        while(j<l2){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        Arrays.sort(ans);
        
        int l3= ans.length;
        if((l3%2)==0){
            double sum =ans[l3/2]+ans[(l3/2)-1];
           return (sum/2.00);
        }
           return ans[l3/2];
    }
}