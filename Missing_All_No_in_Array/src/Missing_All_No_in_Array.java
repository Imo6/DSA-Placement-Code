import java.util.ArrayList;
import java.util.List;

public class Missing_All_No_in_Array {
	public static List<Integer> MisiingNumber(int []a) {
		int i=0;
		List<Integer> ans=new ArrayList<>();
		while(i<a.length)
		{
			int correctIndex=a[i]-1;
			if(a[i]!=a[correctIndex]) {
				//swap
				int temp=a[i];
				a[i]=a[correctIndex];
				a[correctIndex]=temp;
			}
			else {
				i++;
			}
		}
		//Search for first Missing Number
		for(int Index=0;Index<a.length;Index++) {
			if(a[Index]!=Index+1)
				ans.add(Index+1);
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {4,3,2,8,7,2,3,1};
		List<Integer> arr=MisiingNumber(a);
		System.out.println(arr);

	}

}
