package laporan2;

public class LaporanDua {
	static boolean bo;
	static long lo;
	static String \u0073\u0074\u0072;
	static int i;
	static float fl;
	
	public static void main(String args[]) {
		if (i==0) {
			Boolean refBoolean = new Boolean(true);
			boolean bool = refBoolean.booleanValue();
			System.out.println("nilai boolean = " +bool);
			
			Float refflFloat = new Float(12.3F);
			float flo = refflFloat.floatValue();
			System.out.println("nilai float = " +flo);
			
			Long refloLong = new Long(100000000);
			long loo = refloLong.longValue();
			System.out.println("nilai long = " +loo);
			
			str = "Dedy";
			System.out.print(str);
			
		}
		else {
			System.out.println("nilai integer = " +i);
			System.out.println("nilai boolean = " +bo);
			System.out.println("nilai float = " +fl);
			System.out.println("nilai long = " +lo);
			System.out.println("nilai string = " +str);
		}
	}
}
