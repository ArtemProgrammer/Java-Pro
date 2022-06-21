public interface SubscriberService {
    void checkCityTalkTime(Subscriber[] subscribers, int cityTalkTime);
    void checkLongDistanceCallTime(Subscriber[] subscribers);
    void checkInfoByLetter(Subscriber[] subscribers, char letter);
    int checkInternetTrafficCity(Subscriber[] subscribers, String city);
    int checkNegativeBalance(Subscriber[] subscribers);
}
