package opgave_1;

public class Main {

    void main(){
        MediaPlayer mediaplayer = new MediaPlayer();

        Podcast podcast = new Podcast("Starter forfra","Olga", 100 );

        Song song = new Song("Creep","RadioHead",238);

        AudioBook audiobook = new AudioBook("Harry Potter", "J.K. Rowling", 8000);

        mediaplayer.add(podcast);

        mediaplayer.printPlaylist();


        podcast.play();
        song.play();
        audiobook.play();








    }


}
