package music_streaming_application_3a;

public class MusicStreamingApp {
    public static void main(String[] args) {
        // Playing a local file with equalizer and volume control
        MusicPlayer localFilePlayer = new LocalFilePlayer("song.mp3");
        MusicPlayer equalizedLocalPlayer = new EqualizerDecorator(localFilePlayer);
        MusicPlayer fullFeaturedLocalPlayer = new VolumeControlDecorator(equalizedLocalPlayer);
        fullFeaturedLocalPlayer.play();

        System.out.println();

        // Streaming from an online service with equalizer
        MusicPlayer onlinePlayer = new OnlineStreamingPlayer("https://streaming.service.com/song");
        MusicPlayer equalizedOnlinePlayer = new EqualizerDecorator(onlinePlayer);
        equalizedOnlinePlayer.play();

        System.out.println();

        // Playing a radio station with volume control
        MusicPlayer radioPlayer = new RadioStationPlayer("Jazz FM");
        MusicPlayer fullFeaturedRadioPlayer = new VolumeControlDecorator(radioPlayer);
        fullFeaturedRadioPlayer.play();
    }
}
