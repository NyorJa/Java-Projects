import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        
        desertIslandPlaylist.add("Born to Be Yours");
        desertIslandPlaylist.add("Be Alright");
        desertIslandPlaylist.add("Thunderclouds");
        desertIslandPlaylist.add("Eastside");
        desertIslandPlaylist.add("Promises");
        desertIslandPlaylist.add("Body");

        System.out.println(desertIslandPlaylist);
        System.out.println("Number of songs available is " + desertIslandPlaylist.size());

        desertIslandPlaylist.remove("Body");

        String tempSong = desertIslandPlaylist.get(1);

        desertIslandPlaylist.set(1, "Born to Be Yours");
        desertIslandPlaylist.set(0, tempSong);

        System.out.println(desertIslandPlaylist.indexOf("Be Alright"));
        System.out.println(desertIslandPlaylist.indexOf("Born to Be Yours"));

        String tempA = desertIslandPlaylist.get(0);

        desertIslandPlaylist.set(0, "Promises");
        desertIslandPlaylist.set(4, tempA);

        System.out.println(desertIslandPlaylist);
    }
}