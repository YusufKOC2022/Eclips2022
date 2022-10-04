
public class ProCustomer extends Customer {
	private int proId;

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	void proData(ProCustomer proCustomer) {
		System.out.println("Profesyonel Numara ;"+proCustomer.getProId()+"İsim: "+proCustomer.getName()
		+"Tc :"+proCustomer.getIdNumber());
	}
}
