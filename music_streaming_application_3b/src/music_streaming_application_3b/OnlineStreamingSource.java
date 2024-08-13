package music_streaming_application_3b;

class OnlineStreamingSource implements MusicSource {
    private String url;

    public OnlineStreamingSource(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        System.out.println("Streaming from: " + url);
    }
}