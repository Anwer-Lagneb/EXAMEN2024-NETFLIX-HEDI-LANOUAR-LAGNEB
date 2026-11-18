package NETFLIX;

public class User {
	String name ;
	boolean isSub ;
	Content watchedContent[] ;
	int nbWatched ;
	final int MAX_WATCHED = 100 ;
	User(String name , boolean sub){
		this.name = name ;
		this.isSub = sub ;
	}
	public boolean canPlay(Content c) {
		if (this.isSub == true) {
			return true ;
		}
		else {
			if (c.isFree == true) {
				return true ;
			}
			else {}
			return false ;
		}
		
	}
	public void addWatchedContent(Content c){
		if (this.watchedContent.length == this.MAX_WATCHED) {
			System.out.println("Nbr des contents max est atteint !!");
		}
		else {
			this.watchedContent[this.nbWatched] = c ;
			this.nbWatched ++ ;
		}
	}
	public boolean recherche(String[] tab , String ch) {
		boolean trouve=false ;
		for(int i=0 ;i<tab.length;i++) {
			if (tab[i]==ch) {
				trouve = true ;
				break ;
			}
			
		}
		return trouve ;
	}
	public String[] getwatchedgenres() {
		int x = 1 ;
		String watchedgenres[] = new String[x];
		for (int i=0 ;i<this.nbWatched;i++) {
			if (recherche(watchedgenres,this.watchedContent[i].genre) == false) {
				watchedgenres[x] = this.watchedContent[i].genre ;
				x++ ;
			}
			
		}
		
		return watchedgenres ;
	}

}
