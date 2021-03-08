
public class Game {
	
	private String gameName;
	private String genre;
	private int playTime;
	
	public Game() {
		
		this.gameName = gameName;
		this.genre = genre;
		this.playTime = playTime;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	public void theGenre(int age) {
		
		if(age <= 10) {
			
			this.genre = "Educational";
		}
		else if(age > 10 || age < 18) {
			
			this.genre = "FPS";
		}
		else if(age > 19){
			
			this.genre = "RPG";
		}
	}
	
	public String theGame(String genre) {
		
		if(genre.equals("Educational")) {
			
			return "Mario teaches typing";
			
		}
		else if(genre.equals("FPS")) {
			
			return "Modern Warfare";
		}
		else if(genre.equals("RPG")){
			
			return "Person 5 Royal";
		}
		
		return "null";
	}
	
}
