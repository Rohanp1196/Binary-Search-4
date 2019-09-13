class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int ptr1=0;
        int ptr2=0;

        //Two pointer approach
        
        List<Integer> ls = new ArrayList<>();
        
        while(ptr1<nums1.length &&  ptr2<nums2.length){
            
            
            if (nums1[ptr1] == nums2[ptr2]){
                
                ls.add(nums1[ptr1]);
                
                ptr1++;
                ptr2++;
            }
            
            else if(nums1[ptr1]<nums2[ptr2]){
                
                ptr1++;
            }
            else
                ptr2++;
                
        }
        
        
        int res[] = new int[ls.size()];
        
        int i=0;
        
        for (int element: ls){
            
            res[i] = element;
            i++;
            
        }
        return res;
        
        
    }
}