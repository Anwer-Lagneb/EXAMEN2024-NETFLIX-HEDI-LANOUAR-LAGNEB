package NETFLIX;

public class StreamingPlatform {
	User Users[] ;
	Content Contenus[] ;
	int nbrUserEff ;
	int nbrContEff ;
	
	StreamingPlatform(int nbruser,int nbrcont){
		this.nbrUserEff = 0 ;
		this.nbrContEff = 0 ;
		this.Users = new User[nbruser] ;
		this.Contenus = new Content[nbrcont] ;
		
	}
	public void addContent(Content c ) {
		this.Contenus[this.nbrContEff] = c;
		this.nbrContEff ++ ;

		
	}
	public void addUser(User user) {
		this.Users[this.nbrUserEff] = user;
		this.nbrUserEff ++ ;
		
	}
	public void findContent(String title) throws ContentNotFoundException {
		boolean trouve = false ;
		for(int i =0;i<this.nbrContEff;i++) {
			if(this.Contenus[i].title == title) {
				trouve = true ;
			}
		}
		if (trouve==false) {
			throw new ContentNotFoundException("La contenu "+title+" nest pas trouvé !! ");
		}
	}
	public void playContent(User user, String title) throws AccessDeniedException{
		if (user.isSub == true ) {
			System.out.println("User peut avoir cette Contenu .");
			user.nbWatched ++ ;
			
		}
		else {
			throw new AccessDeniedException("User have no Access pour cette Contenu !!");
		}
	}
	public Content[] getRecommendations(User user) {
		int j = 0 ;
		String watched[]= user.getwatchedgenres() ;
		Content recoms[] = new Content[9] ;
		for(int i=0;i<this.nbrContEff;i++) {
			if (user.recherche(watched,this.Contenus[i].genre)) {
				recoms[j] = this.Contenus[i] ;
				j++ ;
			}
		}
		return recoms;
	}
	

}
