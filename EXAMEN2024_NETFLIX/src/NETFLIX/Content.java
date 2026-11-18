package NETFLIX;

public abstract class Content implements streamable {
	String title ;
	String genre ;
	boolean isFree ;
	Content(String ch , String genre , boolean free){
		this.title = ch ;
		this.genre = genre ;
		this.isFree = free ;
	}
	public abstract void afficheDetails() ;
	public void play() {
		System.out.println("Lecture de : " + this.genre);;
		afficheDetails() ;
	}
	

}
