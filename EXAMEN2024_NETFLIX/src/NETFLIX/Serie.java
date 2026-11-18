package NETFLIX;

public class Serie extends Content {
	int nbEpisodes ;
	int DureeEp ;
	Serie(String title , String genre , boolean free,int d ,int nb){
		super(title,genre,free);
		this.DureeEp = d ;
		this.nbEpisodes = nb ;
		
	}
	
	
	public void afficheDetails() {
		System.out.println("Titre du Serie : " + this.title);
		System.out.println("Genre du Serie : " + this .genre);
		System.out.println("Free : " + this.isFree);
		System.out.println("Nombre des Episodes : " + this.nbEpisodes);
		System.out.println("Duration du Episode : " + this.DureeEp + " mn");
	}
	public int getDuration() {
		return this.DureeEp ;
	}

}
