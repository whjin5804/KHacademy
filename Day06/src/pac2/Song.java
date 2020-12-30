package pac2;

public class Song {

	private String title;
	private String artist;
	private String album;
	private int year;
	private String composer1;
	private String composer2;
	private String composer3;
	
	public Song() {
		title = "dynamite";
		artist = "bts";
		album = "?";
		year = 2020;
		composer1 = "??";
		composer2 = "??";
		composer3 = "??";
	}
	
	public void print() {
		System.out.println(title);
		System.out.println(artist);
		System.out.println(album);
		System.out.println(year);
		System.out.println(composer1);
		System.out.println(composer2);
		System.out.println(composer3);
	}
	
}
