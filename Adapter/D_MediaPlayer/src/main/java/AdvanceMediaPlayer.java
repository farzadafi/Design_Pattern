public interface AdvanceMediaPlayer {
    void loadFileName(String fileName);
    void listen();
}

class Mp4Player implements AdvanceMediaPlayer {

    private String fileName;

    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("I listen to " + fileName);
    }
}