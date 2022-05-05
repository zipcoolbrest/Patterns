package observer;

public class YouTuber extends Observable{
    private String name;

    public YouTuber(String name){
        this.name = name;
    }

    public void newVideo(String videoName){
        this.next(name + " added new video " + videoName);
    }
}
