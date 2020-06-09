public class selectionSort{
	public int[] sort(int[] arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	public void display(int[] arr){
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");

		}
	}
	public static void main(String[] args){
		selectionSort select=new selectionSort();
		int[] arr={2,1,5,3,7};
		select.sort(arr);
		select.display(arr);
	}
}