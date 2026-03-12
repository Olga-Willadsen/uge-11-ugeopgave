package opgave_1;

public abstract class MediaItem {

    protected String title;
    protected int durationSeconds;

    public MediaItem (String title, int durationSeconds){
        this.title=title;
        this.durationSeconds=durationSeconds;
    }
    public MediaItem(){
        this.title=title;
        this.durationSeconds=getDurationSeconds();
    }

    public String getTitle() {
        return title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }



//    public void playTimeLongFormat (){
//        int hours = (this.durationSeconds/60)/60; //23040 / 60 = 384, 384/6 = 6,4
//        int minutes = (this.durationSeconds/60)-(hours*60); //384 - 6*60 360= 24
//        int seconds = (this.durationSeconds-(minutes*60))-((hours*60)*60);
//        System.out.println(hours+" : "+minutes+" : "+seconds);
//    }
//
//    public void playTimeSong (){
//        int minutes = (durationSeconds/60);
//        int seconds = durationSeconds-(minutes*60);
//        System.out.println(minutes+" : "+seconds);
//    }








    @Override
    public String toString() {
        return "MediaItem{" +
                "title='" + title + '\'' +
                ", durationSeconds=" + durationSeconds +
                '}';
    }

    //abstract class MediaItem
    //
    //Felter: title (String), durationSeconds (int)
    //Konstruktør: tager title og durationSeconds
    //Metoder: getters, toString()
}
