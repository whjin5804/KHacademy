package pac2;

public class Song {

	private String title;
	private String artist;
	private String album;
	private int year;
	private String[] composer;
	
	//��� �ʵ带 �ʱ�ȭ�ϴ� �޼���
	//������ ����ϴ� �޼���
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
		System.out.println("������ : " + title);
		System.out.println("������ : " + artist);
		System.out.println("�ٹ��� : " + album);
		System.out.println("����⵵�� " + year);
		for (int i = 0; i < composer.length; i++) {
			System.out.print(composer[i] + " ");
		}
		
		
	}
	
}
