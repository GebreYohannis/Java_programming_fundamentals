package classes;

public class Browser {
    public void navigate(String address){
        String ipAddress =  findIpAddress(address);
        String html = sendHttpRequest(ipAddress);
        System.out.println(html);
    }

    private String sendHttpRequest(String ipAddress) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return address;
    }
}
