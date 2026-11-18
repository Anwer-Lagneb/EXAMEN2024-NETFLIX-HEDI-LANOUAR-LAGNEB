package NETFLIX;

public class TEST {
	public static void main(String[] args) {
		StreamingPlatform Mumu = new StreamingPlatform(100,100);
		Movie M1 = new Movie("Inception", "Sci-Fi", false, 148) ;
		Serie S1 = new Serie("Stranger Things", "Thriller", false, 25, 50) ;
		Movie M2 = new Movie("Charlie Chaplin", "Comedy", true, 75) ;
		Serie S2 = new Serie("Friends", "Comedy", true, 236, 22) ;
		M1.afficheDetails();
		M2.afficheDetails();
		S1.afficheDetails();
		S2.afficheDetails();
		
		Mumu.addContent(S1);
		Mumu.addContent(S2);
		Mumu.addContent(M2);
		Mumu.addContent(M2);
		
		User u1 = new User("Imene",false) ;
		User u2 = new User("Jihene",true) ;
		try {
			Mumu.playContent(u1, "Inception");
		}
		catch(AccessDeniedException e){
			e.getMessage();
		}
		finally {
			u1.addWatchedContent(M1);
		}
		
		
		try {
			Mumu.playContent(u1, "Charlie Chaplin");
		}
		catch(AccessDeniedException e){
			e.getMessage();
		}
		finally {
			u1.addWatchedContent(M2);
		}
		
		
		
		try {
			Mumu.playContent(u2, "Stranger Things");
		}
		catch(AccessDeniedException e){
			e.getMessage();
		}
		finally {
			u2.addWatchedContent(S1);
		}
		
		
		try {
			Mumu.playContent(u2, "Friends");
		}
		catch(AccessDeniedException e){
			e.getMessage();
		}
		finally {
			u2.addWatchedContent(S2);
		}
		
		Mumu.getRecommendations(u1);
		Mumu.getRecommendations(u2);

		
		
		
	}

}
