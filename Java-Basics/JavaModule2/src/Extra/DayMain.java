package Extra;

enum Day{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}

public class DayMain {
	
	public static void main(String[] args) {
	Day d1=Day.FRIDAY;
	System.out.println(d1);
	
	System.out.println("---------------------------------");
	
	System.out.println(Day.values());
	
	
	System.out.println("---------------------------------");




	
	Day arr[]=Day.values();
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);

	}
	}

}
