public class Proov1{
	public static void main(String[] arg){
		TakistusKomponent t=new Takisti220oomi();
		System.out.println (t.kysiTakistus());
		System.out.println ("Vool 9 korral: "+t.vool(9));
		TakistusKomponent t2=new Takisti(500);
		System.out.println (t2.kysiTakistus());
		System.out.println ("Vool 9 korral: "+t2.vool(9));
	}
}