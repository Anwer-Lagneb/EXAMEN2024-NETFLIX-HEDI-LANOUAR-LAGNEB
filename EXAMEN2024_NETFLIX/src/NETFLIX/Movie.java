package NETFLIX;

public class Movie extends Content {
	int duration ;
	Movie(String title , String genre , boolean free,int d){
		super(title,genre,free);
		this.duration = d ;
	}
	public void afficheDetails() {
		System.out.println("Titre du Movie : " + this.title);
		System.out.println("Genre du Movie : " + this .genre);
		System.out.println("Free : " + this.isFree);
		System.out.println("Duration du Movie : " + this.duration + " mn");
	}
	public int getDuration() {
		return this.duration ;
	}

}
