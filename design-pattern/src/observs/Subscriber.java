package observs;

public class Subscriber {
	
	private String name;
	private Profile profile = new Profile();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void update() {
		
		System.out.println("Hey " + name + ",Your new photo uploaded: " + profile.title);
	}
	
	public void subscribeProfile(Profile pr) {
		profile = pr;
	}

}
