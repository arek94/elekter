abstract class TakistusKomponent{
	abstract double kysiTakistus();
	/*
	* Leitakse vool vastavalt pingele
	*/
	public double vool(double pinge){
		return pinge/kysiTakistus();
	}
}