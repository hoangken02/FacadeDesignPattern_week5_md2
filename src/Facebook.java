public class Facebook implements SocialShare{
    private String message;

    @Override
    public void setMessage(String message){
        this.message = message;
    }

    public void share(){
        System.out.println("FaceBook to share: " + message);
    }
}
