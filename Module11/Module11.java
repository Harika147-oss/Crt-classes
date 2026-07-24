// // Module 11 – Searching
// // 1. Linear Search
// // 2. Binary Search
// // 3. First occurrence  // 4. Last occurrence  // 5. Count occurrence
// import java.util.Scanner;
// class Solution{
//     public static int firstOccurence(int[] arr,int target){
//         int low=0;int high=arr.length-1;
//         int mid=0;
//         int ans=-1;
//         while(low<=high){
//             mid=(low+high)/2;

        
//         if(arr[mid]==target) {
//             ans=mid;
//             high=mid-1;//only this line changes in both 
//             }
//         else if(target<arr[mid]) high=mid-1;
//         else if(target>arr[mid]) low=mid+1;
       
//         }

//         return ans;

//     }
//     public static int lastOccurence(int[] arr,int target){
//         int low=0;int high=arr.length-1;
//         int mid=0;
//         int ans=-1;
//         while(low<=high){
//             mid=(low+high)/2;

        
//         if(arr[mid]==target) {
//             ans=mid;
//             low=mid+1;
//             }
//         else if(target<arr[mid]) high=mid-1;
//         else if(target>arr[mid]) low=mid+1;
       
//         }
//         return ans;

//     }

// }
// class Module11{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the n valule");
//         int n=sc.nextInt();
//         System.out.println("enter the target");
//         int target=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.println("enter the aray elements");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int ans1= Solution.firstOccurence(arr,target);
//         System.out.println(ans1);
//         int ans2=Solution.lastOccurence(arr,target);
//         System.out.println(ans2);
//          int occurence=ans2-ans1+1;//finding occurence
//          System.out.println(occurence);


//     }
// }




// 6. Search in matrix
// 7. Peak element
// 8. Missing element
// 9. Floor/Ceil
//Floor
// import java.util.Scanner;
// class Solution {
//     public static int floorFunction(int[] arr,int target){
//         int low=0,high=arr.length-1;
//         int mid=0;
//         int floor=-1;
//         if(arr.length==0)return -1;
//         while(low<=high){
//             mid=(low+high)/2;
//             if(target==arr[mid]){
//                 return arr[mid];

//             }
//             else if(arr[mid]<target){
//                 floor=arr[mid];
//                 low=mid+1;
//             }
//             else if(arr[mid]>target){
//                 high=mid-1;
//             }
            
//         }
//         return floor;

//     }
// }
// public class Module11{
// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int target=sc.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//          arr[i]=sc.nextInt();
//     }
//     int ans=Solution.floorFunction(arr,target);
//     System.out.println(ans);
// }
// }

//ceil



import java.util.Scanner;
class Solution{
    public static int ceilFunction(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int ceil=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target)return arr[mid];
            else if(arr[mid]<target){
                    low=mid+1;
            }
            else if(arr[mid]>target){
                ceil=arr[mid];
                high=mid-1;

            }
        }
        return ceil;
    }

}
class Module11{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int target=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int ans=Solution.ceilFunction(arr,target);
    System.out.println(ans);

}
}
// 10. Binary-search variations
// 11. Five additional searching exercise