class Sum2{
public static void main(String args[]){
int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
int arr2[][]={{9,8,7},{6,5,4},{3,2,1}};
int row=arr.length;
int col=arr[0].length;
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(arr[i][j+arr[i][j]+" ");
}
Sustem.out.println();
}
}
}
