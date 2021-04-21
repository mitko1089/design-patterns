package observs;

public class InstagramMain {

	public static void main(String[] args) {
	
		Profile mitko = new Profile();
		
		Subscriber s1 = new Subscriber("Tedi");
		Subscriber s2 = new Subscriber("Reni");
		Subscriber s3 = new Subscriber("Evi");
		Subscriber s4 = new Subscriber("Dany");
		Subscriber s5 = new Subscriber("Plamen");
		Subscriber s6 = new Subscriber("Hary");
		
		mitko.subscribe(s1);
		mitko.subscribe(s2);
		mitko.subscribe(s3);
		mitko.subscribe(s4);
		mitko.subscribe(s5);
		mitko.subscribe(s6);
		
		s1.subscribeProfile(mitko);
		s2.subscribeProfile(mitko);
		s3.subscribeProfile(mitko);
		s4.subscribeProfile(mitko);
		s5.subscribeProfile(mitko);
		s6.subscribeProfile(mitko);
		
		mitko.upload("This is your new photo");

	}

}
