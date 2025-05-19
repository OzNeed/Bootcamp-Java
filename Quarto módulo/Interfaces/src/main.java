public class main {
    public static void main(String[] args) {
        // Computer musicPlayer = new Computer();
        // Aqui ele e declarado como Computer e por isso não da erro e entende a declaração
        // MusicPlayer musicPlayer = new Computer();
        // runMusic(musicPlayer);
        // runVideo(musicPlayer);
        // runMusic(musicPlayer);
        // runVideo((VideoPlayer)musicPlayer);
        runMusic(new Computer());
        runVideo(new Computer());
    }


    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }
    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
