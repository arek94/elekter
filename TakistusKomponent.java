abstract class TakistusKomponent{
	abstract double kysiTakistus();
	/*
	* Leitakse vool vastavalt pingele
	* @param pinge - rakendatav pinge voltides
	*/
	public double vool(double pinge){
		return pinge/kysiTakistus();
	}
}