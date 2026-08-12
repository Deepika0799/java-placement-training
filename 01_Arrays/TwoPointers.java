import java .util.*;
class TwoPointers{
public static void main(String[] args){
int arr[]={1,2,3,4,5,6,7,8};
int n=arr.length;
int left=0;
int right=n-1;
int target=20;
boolean found=false;
  while(left<right){
     int sum=arr[left]+arr[right];
     if(sum==target)
        {   found=true;
            System.out.println("pairs:"+arr[left]+" "+arr[right]);
            break;
        }
     else if(sum<target)
       {
           left++;
       }
     else{
        right--; 
         }
            }
   if(found==false)
           {
               System.out.println("no pairs");
           }

   }
}