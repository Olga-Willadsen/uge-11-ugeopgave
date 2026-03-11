package opgave_1;

public class Song extends MediaItem implements Playable {

    private String artist;

//    Song(String artist){
//        super("",0);
//        this.artist=artist;
//    }

    Song (String title, String artist, int durationSeconds){
        this.title=title;
        this.artist=artist;
        this.durationSeconds=durationSeconds;
    }

    @Override
    public void play() {
        System.out.println("🎵 \u001B[32m Now playing: "+getTitle()+" by: "+this.artist+"\u001B[0m");
    }


    //Song — nedarver fra MediaItem, implementerer Playable
    //
    //Felt: artist (String)
    //Konstruktør: tager title, artist, durationSeconds
    //play() printer fx: ♪ Afspiller: "Comfortably Numb" af Pink Floyd (6:22)
}
