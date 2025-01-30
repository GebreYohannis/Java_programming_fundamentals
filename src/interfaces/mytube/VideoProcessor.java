package interfaces.mytube;

public class VideoProcessor {
    private final VideoEncoder encoder;
    private final VideoDatabase database;
    private final NotificationService emailService;

    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            NotificationService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        System.out.println("Processing video ...");
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
        System.out.println("Done!\n");
    }
}
