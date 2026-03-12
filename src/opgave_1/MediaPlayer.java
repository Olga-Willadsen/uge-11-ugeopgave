package opgave_1;

import java.util.ArrayList;

public class MediaPlayer {

    ArrayList<Playable> playableItems = new ArrayList();

    void add(Playable p) {
        playableItems.add(p);
    }

    void playAll() {
        for (Playable p : playableItems) {
            p.play();
        }
    }

    int getTotalDurations() {
        int sum = 0;
        for (Playable p : playableItems) {
            sum += p.getDurationSeconds();
        }
        return sum;
    }

    void printPlaylist() {
        System.out.println("= = = PLAYLIST = = = "+ playableItems.size()+" Elements");

        for (int i = 0; i < playableItems.size(); i++) {
            System.out.print((i + 1)+". " +"'"+ playableItems.get(i).getTitle()+"'");
            System.out.print(" - ");
            System.out.print(playableItems.get(i).getDurationSeconds());
            System.out.print(" seconds");
            System.out.println(); // if playable item instance of song playableItem.get(i).playtimesong... else..
        }
    }

    void printPlaylistAlternative(){
        System.out.println("= = = PLAYLIST = = = "+ playableItems.size()+" Elements");

        for (int i = 0; i < playableItems.size(); i++) {
            System.out.print((i + 1)+". " +"'"+ playableItems.get(i).getTitle()+"'");
            System.out.print(" - ");
            if (playableItems.get(i) instanceof Podcast || playableItems.get(i) instanceof AudioBook){
                System.out.println(playableItems.get(i).playTimeLongFormat());
            } else System.out.println(playableItems.get(i).playTimeSong());
        }
            System.out.println(); // if playable item instance of song playableItem.get(i).playtimesong... else..
    }


        public void mediaPlayerGenerator(){

            this.add(new Podcast("S-town", "Serial", 23040));
            this.add(new Podcast("Dronekrigeren", "DR", 27840));
            this.add(new AudioBook("Harry Potter and the half blood prince", "J.K. Rowling", 73860));
            this.add(new AudioBook("Vinterbørn", "Dea Trier Mørch", 28020));
            this.add(new Song("Creep",238,"RadioHead"));
            this.add(new Song("Common People", 351, "pulp"));
            this.add(new Song("it's oh so quiet",220, "Björk"));
        }


        //MediaPlayer
        //
        //Felt: playlist (ArrayList<Playable>)
        //Metoder:
        //void add(Playable item)
        //void playAll() — kalder play() på alle elementer
        //int getTotalDuration() — samlet varighed i sekunder
        //void printPlaylist() — printer titler og varighed

    }
