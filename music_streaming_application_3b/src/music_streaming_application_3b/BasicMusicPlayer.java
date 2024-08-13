package music_streaming_application_3b;

class BasicMusicPlayer extends MusicPlayer {

    public BasicMusicPlayer(MusicSource source) {
        super(source);
    }

    @Override
    public void play() {
        source.play();
    }
}