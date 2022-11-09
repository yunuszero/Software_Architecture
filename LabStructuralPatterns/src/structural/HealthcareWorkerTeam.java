package structural;

import java.util.ArrayList;
import java.util.List;

public class HealthcareWorkerTeam implements HealthcareServiceable {

	private List<HealthcareServiceable> ListHeal = new ArrayList<HealthcareServiceable>();
	@Override
	public void service() {
		for(HealthcareServiceable item : ListHeal) {
			item.service();
		}
		
	}

	@Override
	public double getPrice() {
		int totalPrice = 0;
		for(HealthcareServiceable item : ListHeal) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

	public void addMember(HealthcareServiceable Member) {
		ListHeal.add(Member);
		
	}

	public void removeMember(HealthcareServiceable Member) {
		ListHeal.remove(Member);
		
	}

}
