package structural;

import java.util.ArrayList;
import java.util.List;

public class HealthcareWorkerTeam implements HealthcareServiceable {

	private List<HealthcareServiceable> members = new ArrayList<HealthcareServiceable>();
	@Override
	public void service() {
		for(HealthcareServiceable item : members) {
			item.service();
		}
		
	}

	@Override
	public double getPrice() {
		int totalPrice = 0;
		for(HealthcareServiceable item : members) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

	public void addMember(HealthcareServiceable Member) {
		members.add(Member);
		
	}

	public void removeMember(HealthcareServiceable Member) {
		members.remove(Member);
		
	}

}
