package transport;

public abstract class Transport {
    String getNum;  // 번호
    int fuel;  // 주유량
    int speed = 0;  // 현재 속도
    int currentPassenger;  // 현재 승객 수
    int maxPassenger;  // 최대 승객 수
    boolean situation = true;  // true = 운행(Bus), 일반(Taxi) / false = 차고지행(Bus), 탑승 불가(Taxi)
    String destination;  // 목적지
    int basicDist = 1;  // 기본 거리
    int finalDist;  // 목적지까지 거리
    int basicFare = 3000;  // 기본 요금
    int addFare = 1000;  // 거리당 추가 요금


    public abstract void run();
    public abstract void checkFuel(int fuel);
    public abstract void speedUp(int x);
    public abstract void speedDown(int x);

}
