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
