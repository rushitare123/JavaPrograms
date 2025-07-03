package allInOne;

public class enumExample {

	enum color{
		Red ,
		Green,
		Yello;
	}
	public static void main(String[] args) {
		
		color c=color.Red;
		switch(c) {
		case Red: System.out.println("print red color ");
		break;
		case Green :System.out.println("Print greeen  color");
		break;
		case Yello: System.out.println("Print yello color");
		break;
		default :System.out.println("Please select color.....");
		}

	}

}
