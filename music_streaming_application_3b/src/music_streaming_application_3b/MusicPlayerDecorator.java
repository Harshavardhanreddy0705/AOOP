package music_streaming_application_3b;
abstract class MusicPlayerDecorator extends MusicPlayer {

    protected MusicPlayer decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer.source);
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
    }
}