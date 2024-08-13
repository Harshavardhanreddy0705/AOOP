package music_streaming_application_3b;

public class MusicStreamingApp {
    public static void main(String[] args) {
        // Create music sources
        MusicSource localFile = new LocalFileSource("song.mp3");
        MusicSource onlineStream = new OnlineStreamingSource("https://streaming.service.com/song");
        MusicSource radioStation = new RadioStationSource("Jazz FM");

        // Play local file with basic player
        MusicPlayer basicLocalPlayer = new BasicMusicPlayer(localFile);
        basicLocalPlayer.play();

        System.out.println();

        // Play online stream with equalizer
        MusicPlayer onlinePlayerWithEqualizer = new EqualizerDecorator(new BasicMusicPlayer(onlineStream));
        onlinePlayerWithEqualizer.play();

        System.out.println();

        // Play radio station with equalizer and volume control
        MusicPlayer radioPlayerWithFeatures = new VolumeControlDecorator(
                new EqualizerDecorator(new BasicMusicPlayer(radioStation)));
        radioPlayerWithFeatures.play();
    }
}
