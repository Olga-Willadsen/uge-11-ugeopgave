package opgave_1;

public class AudioBook extends MediaItem implements Playable {

    String author;

//    AudioBook(String author){
//        super("",0);
//        this.author=author;
//    }

    AudioBook (String title, String author, int durationSeconds){
        super(title, durationSeconds);
        this.author=author;
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
        System.out.println("\uD83D\uDCD8 \u001B[34m Now playing: "+getTitle()+" by: "+this.author+"\u001B[0m");
    }


    //Audiobook — nedarver fra MediaItem, implementerer Playable
    //
    //Felt: author (String)
    //Konstruktør: tager title, author, durationSeconds
    //play() printer fx: 📖 Afspiller lydbog: "Dune" af Frank Herbert (21:14:00)
}
