public interface MediaPlayer {
    void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3"))
            System.out.println("AudioPlayer play " + fileName);
        else
            System.out.println("Invalid media " + audioType + "format not supported!");
    }
}
