package in2017_WinterVacation;

import java.util.ArrayList;
import java.util.Collections;

public class C4010405 {
    public static void main(String[] args) {
        Song dancingQueen = new Song("Dancing Queen", "ABBA", "The Albums", new ArrayList<>(Collections.singletonList("ABBA")), "2008", 2);
        dancingQueen.show();
    }
}

class Song {
    private String title;
    private String artist;
    private String album;
    private ArrayList<String> composers;
    private String year;
    private int trackNum;

    Song(String title, String artist, String album, ArrayList<String> composers, String year, int trackNum) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.composers = composers;
        this.year = year;
        this.trackNum = trackNum;
    }

    void show() {
        System.out.println("Title : " + title + " / Artist : " + artist + " / Album : " + album + " / Composers : " + composers + " / Year : " + year + " / Track No. : " + trackNum);
    }
}