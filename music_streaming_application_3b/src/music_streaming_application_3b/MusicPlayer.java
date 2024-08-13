package music_streaming_application_3b;

abstract class MusicPlayer {
    protected MusicSource source;

    public MusicPlayer(MusicSource source) {
        this.source = source;
    }

    public abstract void play();
}