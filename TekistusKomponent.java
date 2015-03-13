abstract class TakistusKomponent{
	abstract double kysiTakistus();
	public double vool(double pinge){
		return pinge/kysiTakistus();
	}
}