package Extra;

enum Season
{
	SUMMER,WINTER,MANSOON,AUTUMN;
}

public class SeasonMain {
	public static void main(String[] args) {
		Season choice=Season.AUTUMN;
		switch(choice)
		{
		case SUMMER:System.out.println("HOT");
		break;
		case WINTER:System.out.println("COLD");
		break;
		case MANSOON:System.out.println("Wet");
		break;
		case AUTUMN:System.out.println("WINDY");
		}
	}

}
