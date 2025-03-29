package annotations.dependecyinjection;

public class TestDependencyInjection {
    public static void test() {
        DependencyInjector injector = new DependencyInjector();

        // Register dependency

        injector.register(MessageService.class,new EmailService());

//        Create an instance and inject dependency

        NotificationService notificationService = new NotificationService();
        injector.injectDependency(notificationService);
        notificationService.send("Hello from dependency Injection");

        injector.register(MessageService.class,new SMSService());
        injector.injectDependency(notificationService);
        notificationService.send("Hello from dependency injection for the second time");

        var dependencies = injector.getDependencies();
        for (var dependency:dependencies.keySet())
            System.out.println(dependency.getName());
    }
}
