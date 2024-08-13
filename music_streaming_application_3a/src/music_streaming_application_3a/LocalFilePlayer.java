package music_streaming_application_3a;

class LocalFilePlayer implements MusicPlayer {
    private String fileName;

    public LocalFilePlayer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }
}