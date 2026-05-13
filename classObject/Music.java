class Music {
    public static void playMusic(String music) {
    	System.out.println("Playing song");
        System.out.println("Ads will appear after every song: " + music);
    }

    public static void playMusic(String music, String paid) {
        System.out.println("Playing song");
        System.out.println("Enjoy your add free music: " + music);
        System.out.println("You are in premium version: "+paid);
    }
}
