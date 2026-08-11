import java.util.*;
class secondLargest{
  public static void main(String[] args)
{
  int arr[]={10,5,20,8,15};
 int largest;
int secondLargest;

if (arr[0] > arr[1]) {
    largest = arr[0];
    secondLargest = arr[1];
}else{
  largest = arr[1];
    secondLargest = arr[0];
  }

  
 for(int i=2;i<arr.length;i++)
{
    if(arr[i]>largest){
     secondLargest = largest;
        largest = arr[i];
    }else if(arr[i]>secondLargest){
    secondLargest=arr[i];
  }
}
System.out.println(secondLargest);
  }
}



