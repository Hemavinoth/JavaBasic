package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNo=0;
		int secNo=1;
		int sum=0;
		
		System.out.println(firstNo +"\n"+ secNo);
		for(int i=1;i<=11;i++)
		{
			sum=firstNo+secNo;
			firstNo=secNo;
			secNo=sum;
			System.out.println(sum);
			
		}
		

	}

}
