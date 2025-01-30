package interfaces.mytube;

public class TestMyTube {
    public static void doTest(){
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("John's birthday");
        video.setUser(new User("demisgech","john@domain.com"));

        VideoProcessor processor =
                new VideoProcessor( new XVideoEncoder(),
                new XVideoDatabase(),new EmailService());
        processor.process(video);
    }
}
