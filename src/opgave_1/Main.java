package opgave_1;

public class Main {
    MediaPlayer mediaplayer = new MediaPlayer();

    void main(){

        mediaplayer.mediaPlayerGenerator();

        mediaplayer.printPlaylist();
        System.out.println();
        mediaplayer.playAll();

        Podcast podcast = new Podcast("S-town", "Serial", 23040);
        podcast.playTimeLongFormat();

        Song song = new Song ("Creep",238,"RadioHead");

        mediaplayer.print();




    }


}
