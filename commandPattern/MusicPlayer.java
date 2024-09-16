public class MusicPlayer implements Device {

    private static String songTitle = "Maybe This Time by Sarah Geronimo";
    private static String songPlaylist = "Old Filipino Songs";

    @Override
    public void turnOn() {
        System.out.println("The Music Player is Switched On!"+" "+"Now Listening to:"+" "+songTitle);
    }

    @Override
    public void turnOff() {
        System.out.println("The Music Player is Switched Off!");
    }

    public void switchPlaylist() {
        System.out.println("Switched to: "+" "+songPlaylist);
    }
}