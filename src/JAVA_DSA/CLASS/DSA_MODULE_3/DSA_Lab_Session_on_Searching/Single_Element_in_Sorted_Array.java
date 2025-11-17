package CLASS.DSA_MODULE_3.DSA_Lab_Session_on_Searching;

/*
        Ye jo problem hai wo eek purane problem joki humlog bit manupulation me
        solve kiye the waisa he hai.
        1.Iska bruteforce hai ki frequency count karlenge agar count 1 aya to return karenge
        2.Thoda better me jayenge to Hashing ka bhe use kar sakte hai ye  - TC O(n)
        3.Xor Ka use kar ke sare elements ko XOr Kar denge and Single element milega - TC - O(n)
        4.Binary Search use kar ke TC ko O(log n) kar lenge

        For binary Search Rules and Regulations
        1.pehle hum start ko 0 and end ko n-1 pe initialize karenge then hum mid calculte karenge
        isme eek bahu bada observation and catch hai ki unique element se pehle sare elements ka
        starting index even hai and unique elements ke baad odd hai
        to sable pehle jab hum mid nikalenge tab hum check karenge ki mid-1 jo hai A[mid] ke
        barabar hai to mid ko mid-1 kar denge
        2.uske baad mid element ko check karenge ki kya wo unique hai uske liye eek unique
        naam ka function bana lenge aur usme condition ke basis pe true false return karenge
        3.agar unique to ans variable me save kar lenge
        4.agar mid odd hai to end = mid -1 nahee to start - mid +1
         */

public class Single_Element_in_Sorted_Array {
    public static boolean isunique(int[]A,int mid){
        int left = safeget(A,mid-1);
        int right = safeget(A,mid+1);
        if (A[mid]!=left&& A[mid]!=right){
            return true;
        }else {
            return false;
        }
    }
    public static int safeget(int[]A,int mid){
        int n = A.length;
        if(mid >=0 && mid < n){
            return A[mid];
        }else{
            return Integer.MAX_VALUE;
        }
    }
    public static int solve(int[]A){
        int n = A.length;
        int start = 0;
        int end = n-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid > 0 && A[mid]==A[mid-1]){
                mid = mid-1;
            }
            if(isunique(A,mid)){
                return mid;
            }
            if(mid %2 ==1){
                end = mid-1;
            }else {
                start = mid+2;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] A = {1, 1, 7};
        int [] B = {1,1,2,2,3};
        System.out.println(solve(B));
    }
}
