package opgave_1;

public class Podcast extends MediaItem implements Playable {

    String host;

//    Podcast(String host){
//        super("",0);
//        this.host=host;
//    }

    Podcast (String title, String host, int durationSeconds){
       super(title, durationSeconds);
        this.host=host;

    }


    public String getHost() {
        return host;
    }

    @Override
    public boolean playTimeLongFormat (){
        int hours = (this.durationSeconds/60)/60; //23040 / 60 = 384, 384/6 = 6,4
        int minutes = (this.durationSeconds/60)-(hours*60); //384 - 6*60 360= 24
        int seconds = (this.durationSeconds-(minutes*60))-((hours*60)*60);
        System.out.println(hours+" : "+minutes+" : "+seconds);
        return false;
    }

    @Override
    public boolean playTimeSong() {
        return false;
    }


    @Override
    public void play() {
        System.out.println("\uD83C\uDF99\uFE0F \u001B[31m Now playing: "+getTitle()+" by: "+this.host+"\u001B[0m");
    }


    //Podcast — nedarver fra MediaItem, implementerer Playable
    //
    //Felt: host (String)
    //Konstruktør: tager title, host, durationSeconds
    //play() printer fx: 🎙 Afspiller podcast: "Lex Fridman #400" med Lex Fridman (1:42:17)
}
