public class SocialMediaShare {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SocialMediaShare(Twitter twitter, Facebook facebook, LinkedIn linkedIn){
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String message){
        this.twitter.setMessage("Code");
        this.facebook.setMessage("Gym");
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.linkedIn.share();
    }
}
