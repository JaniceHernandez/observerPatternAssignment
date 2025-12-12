import java.util.*;

public class NewsAgency implements NewsAgencySubject {
    private List<Subscriber> subscribers;
    private String news;

    public NewsAgency() {
        subscribers = new ArrayList<>();  
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
    this.news = news;

    System.out.println("\n================ BREAKING NEWS ================");
    System.out.println("\t" + news);
    System.out.println("===============================================\n");
    notifySubscribers();
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }



    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    } 
}
