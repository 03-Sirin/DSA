class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
        int n=nums1.length+nums2.length;
        int low=0,high=n1;
        int left=(n+1)/2;
        while(low<=high){
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
            if(mid1-1>=0) l1=nums1[mid1-1];
            if(mid2-1>=0) l2=nums2[mid2-1];
            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if(l1<=r2 && l2<=r1){
                if(n%2!=0){
                    return Math.max(l1,l2);
                }else{
                    int e1=Math.max(l1,l2);
                    int e2=Math.min(r1,r2);
                    return ((double)e1+e2)/2;
                }
            }else if(l1>r2){
                high=mid1-1;
            }else{
                low=mid1+1;
            }

        }
        // while(i<nums1.length && j<nums2.length){
        //     int val=0;
        //     if(nums1[i]<nums2[j]){
        //         val=nums1[i++];
        //     }else{
        //         val=nums2[j++];
        //     } 
        //     if(mid-1==count) ele1=val;
        //     if(mid==count) ele2=val;
        //     count++;
        // }
        // while(i<nums1.length){
        //     int val=nums1[i++];
        //     if(mid-1==count) ele1=val;
        //     if(mid==count) ele2=val;
        //     count++;
        // }
        // while(j<nums2.length){
        //     int val=nums2[j++];
        //     if(mid-1==count) ele1=val;
        //     if(mid==count) ele2=val;
        //     count++;
        // }
        // if(n%2!=0) return (double) ele2;
        // return ((double)ele1+ele2)/2;
        return 0;
    }
}