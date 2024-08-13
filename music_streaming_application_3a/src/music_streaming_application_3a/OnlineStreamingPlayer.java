package music_streaming_application_3a;

class OnlineStreamingPlayer implements MusicPlayer {
    private String serviceUrl;

    public OnlineStreamingPlayer(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    @Override
    public void play() {
        System.out.println("Streaming from: " + serviceUrl);
    }
}
