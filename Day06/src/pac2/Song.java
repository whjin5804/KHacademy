package pac2;

public class Song {

	private String title;
	private String artist;
	private String album;
	private int year;
	private String[] composer;
	
	//모든 필드를 초기화하는 메서드
	//정보를 출력하는 메서드
	public Song() {
		title = "dynamite";
		artist = "bts";
		album = "?";
		year = 2020;
		composer = null;
	}
	
	public void initSongInfo(String title, String artist, String album, String[] composer, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
	}
	
	public void printSongInfo() {
		System.out.println("제목은 : " + title);
		System.out.println("가수는 : " + artist);
		System.out.println("앨범은 : " + album);
		System.out.println("발행년도는 " + year);
		for (int i = 0; i < composer.length; i++) {
			System.out.print(composer[i] + " ");
		}
		
		
	}
	
}
