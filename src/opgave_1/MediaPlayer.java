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
        for (int i = 0; i < playableItems.size(); i++) {

            System.out.println("= = = PLAYLIST = = = "+ playableItems.size()+" Elements");
            System.out.print((i + 1)+". " +"'"+ playableItems.get(i).getTitle()+"'");
            System.out.print(" - ");
            System.out.print(playableItems.get(i).getDurationSeconds());
            System.out.print("seconds");
            System.out.println();
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
}