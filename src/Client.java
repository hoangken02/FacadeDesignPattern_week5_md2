public class Client {
    public void share(String message){
        SocialMediaShare socialMediaShare = new SocialMediaShare(new Twitter(),new Facebook(),new LinkedIn());
        socialMediaShare.share(message);
    }
}
