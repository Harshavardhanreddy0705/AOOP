package music_streaming_application_3b;

class RadioStationSource implements MusicSource {
    private String stationName;

    public RadioStationSource(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void play() {
        System.out.println("Playing radio station: " + stationName);
    }
}