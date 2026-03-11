package opgave_1;

public class AudioBook extends MediaItem implements Playable {

    String author;

//    AudioBook(String author){
//        super("",0);
//        this.author=author;
//    }

    AudioBook (String title, String author, int durationSeconds){
        this.title=title;
        this.author=author;
        this.durationSeconds=durationSeconds;
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
