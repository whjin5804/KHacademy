package pac2;

public class SongInfo {

	public static void main(String[] args) {
		Song song = new Song();
		String[] composer = {"IU", "JYP","SM"};
		song.initSongInfo("Dynamite", "BTS", "For small people", composer, 2020);
		song.printSongInfo();
	}

}
