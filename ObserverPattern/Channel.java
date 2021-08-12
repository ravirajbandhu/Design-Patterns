public class Channel implements Subject{
    
    private String name;
    private List<Observer> observers; 
    public Channel (String channelName) {
        name = channelName;
        observers = new ArrayList();
    }

    @Overide
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Overide
    public void unsubscribe(Observer o ) {
        observers.remove(o);
    }

    @Overide
    public void notifyAllObserver(String s) {
        for(Observer o : observers) {
            observer.update();
        }
    }
}