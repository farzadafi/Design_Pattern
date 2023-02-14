public class Client {
    public static void main(String[] args) {
        MusicFactory musicFactory = new MusicFactory();

        MusicPlayer musicPlayer = musicFactory.getMusicPlayer(MusicType.OGG);
        musicPlayer.play();
    }
}
