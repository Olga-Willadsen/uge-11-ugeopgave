package opgave_1;

public class Podcast extends MediaItem implements Playable {

    String host;

//    Podcast(String host){
//        super("",0);
//        this.host=host;
//    }

    Podcast (String title, String host, int durationSeconds){
        this.title=title;
        this.host=host;
        this.durationSeconds=durationSeconds;
    }


    public String getHost() {
        return host;
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
