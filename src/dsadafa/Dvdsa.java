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
	//int 1stplayer;    //���ڷ� �����ϸ� �ȵ�
	//myprogram.java;   //��밡�� ��ȣ�� _, $
	//int long;         //�ڹ� ���� ������ ����
	int Timelimit;       //����, �������� �ҹ��ڷ� ������ ��
	int Numberofwindows; //����
	
	// 4.
	// ǥ���� : expression
	// ����̳� ó���� ���� �ۼ��ϴ� ���� �ǹ�
	// ���п��� ���ϴ� ���İ� ����
	// ǥ������ �߿��� Ư¡�� ��evaluate��
	// ��, �ڵ��� ����� �˾Ƴ��� ������ �ǹ�
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
