package music_streaming_application_3b;

class LocalFileSource implements MusicSource {
    private String fileName;

    public LocalFileSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }
}