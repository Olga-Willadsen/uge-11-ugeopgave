package opgave_1;

public class Song extends MediaItem implements Playable {

    private String artist;

    Song(String title, int durationSeconds, String artist){
        super(title, durationSeconds);
        this.artist=artist;
    }
@Override
    public void playTimeSong (){
        int minutes = (durationSeconds/60);
        int seconds = durationSeconds-(minutes*60);
        System.out.println(minutes+" : "+seconds);
}

    @Override
    public void play() {
        System.out.println("🎵 \u001B[32m Now playing: "+getTitle()+" by: "+this.artist+"\u001B[0m");
    }

    @Override
    public void playTimeLongFormat() {
    }


    //Song — nedarver fra MediaItem, implementerer Playable
    //
    //Felt: artist (String)
    //Konstruktør: tager title, artist, durationSeconds
    //play() printer fx: ♪ Afspiller: "Comfortably Numb" af Pink Floyd (6:22)
}
