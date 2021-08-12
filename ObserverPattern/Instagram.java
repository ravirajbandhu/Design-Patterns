public class Instagram {
    public static void main(String[] args) {
        User u1 = new User("User 1");
        User u2 = new User("User 2");
        User u3 = new User("User 3");

        Channel channel = new Channel("Channel 1");

        channel.subscribe(u1);
        channel.subscribe(u2);

        channel.notifyAllObserver("Video Name");

        channel.unsubscribe(u2);
        channel.subscribe(u3);

        channel.notifyAllObserver("Video 2 Name");

    }
}