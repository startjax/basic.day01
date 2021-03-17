package dsadafa;

public class Dvdsa {
	public static void main(String[] args) {
	
	// 1.
	// =
	System.out.println("*   *     **     ****    ****    *   *     ////");
	System.out.println("*   *     **     *   *   *   *   *   *     ////");
	System.out.println("*****    *  *    ****    ****     * *      ////");
	System.out.println("*   *   ******   *  *    *  *      *       ////");
	System.out.println("*   *   *    *   *   *   *   *     *       ////");

	
	System.out.println("+---+");
	System.out.println("|   |");
	System.out.println("+---+");
	
	
	// 3.
	int rate1;
	//int 1stplayer;    //숫자로 시작하면 안됨
	//myprogram.java;   //사용가능 기호는 _, $
	//int long;         //자바 예약어를 변수로 선언
	int Timelimit;       //가능, 변수명은 소문자로 시작할 것
	int Numberofwindows; //가능
	
	// 4.
	// 표현식 : expression
	// 계산이나 처리를 위해 작성하는 식을 의미
	// 수학에서 말하는 수식과 유사
	// 표현식의 중요한 특징은 평가evaluate임
	// 즉, 코드의 결과를 알아내는 과정을 의미
	int x, y, z, s0, v, t, g, result;
	x = 10;
	y = 20;
	z = 30;
	s0 = 5;
	v = 10;
	t = 15;
	g = 10;
	
	result = 3 * x;           // 3x
	System.out.print("3x = ");
	System.out.println(result);
	
	System.out.print("(x + y) / 7 = ");
	System.out.println( (x + y) / 7 );
	
	result = (3 * x + y) / (z + 2);
	System.out.print("(3 * x + y) / (z + 2 ) =");
	System.out.println(result);
	
	// result = s0 + v * t + 1/2 * g * t * t;
	result = s0 + v * t + (1/2) * g * t ^ 2;
	System.out.print(
			"so + v * t + (1/2) * g * t ^ 2 = ");
	System.out.println(result);
	
	// 5.
	double number = (1 / 3) * 3;
	System.out.println(
			" ( 1 / 3 ) * 3 = " + number);
	}
}
