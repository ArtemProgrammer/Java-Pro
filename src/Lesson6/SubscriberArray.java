package Lesson6;

public class SubscriberArray {
    public static Subscriber[] subscribers = new Subscriber[15];
    private static final Subscriber Artem = new Subscriber(1, "Lushnya", "Artem", "Victorovich",
            "Odessa", "0979533936", "7896547825142368",
            -5, 35, 22, 200);
    private static final Subscriber Vanya = new Subscriber(2, "Godov", "Vanya", "Andreevich",
            "Odessa", "0634568521", "5164789315842536",
            13, 65, 50, 150);
    private static final Subscriber Inna = new Subscriber(3, "Popova", "Inna", "Igorevna",
            "Odessa", "0978794563", "9649751325478964",
            67, 135, 13, 316);
    private static final Subscriber Sasha = new Subscriber(4, "Nevoliev", "Sasha", "Vyacheslavovich",
            "Odessa", "0965551135", "6488741417859346",
            74, 400, 0, 500);
    private static final Subscriber Alex = new Subscriber(5, "Lunova", "Alex", "Romanovich",
            "Odessa", "0959654123", "9659847412457863",
            -15, 0, 120, 410);
    private static final Subscriber Egor = new Subscriber(6, "Polyacov", "Egor", "Alexandrovich",
            "Odessa", "0664785214", "3134659845613278",
            36, 44, 99, 369);
    private static final Subscriber Olga = new Subscriber(7, "Istomireeva", "Olga", "Viktorovna",
            "Odessa", "0977456395", "9646451525287843",
            -10, 39, 0, 221);
    private static final Subscriber Rita = new Subscriber(8, "Osipowa", "Rita", "Olegovna",
            "Odessa", "0668794563", "3635314275471398",
            73, 98, 90, 55);
    private static final Subscriber Alina = new Subscriber(9, "Drushneva", "Alina", "Romanovna",
            "Odessa", "0950991475", "8318479648517523",
            22, 256, 0, 346);
    private static final Subscriber Pasha = new Subscriber(10, "Esenin", "Pasha", "Alexeevich",
            "Odessa", "0660258964", "5458613654785312",
            40, 0, 28, 459);
    private static final Subscriber Roma = new Subscriber(11, "Nolland", "Roma", "Artyomovich",
            "Odessa", "0503489315", "2123696854718319",
            100, 365, 55, 100);
    private static final Subscriber Oleg = new Subscriber(12, "Lavrov", "Oleg", "Egorovich",
            "Odessa", "0771843651", "4236538945128735",
            13, 123, 96, 152);
    private static final Subscriber Julia = new Subscriber(13,"Izmaileva", "Julia", "Pavlovna",
            "Odessa", "0989431257", "3694687152368456",
            150, 25, 144, 222);
    private static final Subscriber Sonya = new Subscriber(14, "Doteva", "Sonya", "Victorovna",
            "Odessa", "0999441175", "9441475821515448",
            30, 15, 155, 364);
    private static final Subscriber Konstantin = new Subscriber(15, "Branin", "Konstantin", "Sergeevich",
            "Odessa", "0509974463", "3699852456982311",
            50, 47, 320, 95);

    public static Subscriber[] getSubscribers() {
        subscribers[0] = Artem;
        subscribers[1] = Vanya;
        subscribers[2] = Inna;
        subscribers[3] = Sasha;
        subscribers[4] = Alex;
        subscribers[5] = Egor;
        subscribers[6] = Olga;
        subscribers[7] = Rita;
        subscribers[8] = Alina;
        subscribers[9] = Pasha;
        subscribers[10] = Roma;
        subscribers[11] = Oleg;
        subscribers[12] = Julia;
        subscribers[13] = Sonya;
        subscribers[14] = Konstantin;
        return subscribers;
    }
}