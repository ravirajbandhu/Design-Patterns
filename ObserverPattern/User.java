public class User implements Observer{
    private String name;

    public User(String userName) {
        name = userName;
    }

    @Overide
    public void update(String message){
        System.out.println(" Hi "+name+ " there is a video which you may like " + message);
    }
}