public class ReverseTheArray {
public static void main(String[] args) {
  int arr[]={1,2,4,3,5}; 
  for(int i=0;i<arr.length/2;i++){
    int t=arr[i];
    arr[i]=arr[arr.length-1-i];
    arr[arr.length-1-i]=t;
  }
  for(int i=0;i<arr.length;i++){
  System.out.println(arr[i]);}
}}
    

