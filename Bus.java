package transport;
import java.util.UUID;

public class Bus extends Transport {

    Bus() {
        run();
        }

    @Override
    public void run() {
        this.getNum = UUID.randomUUID().toString().substring(0,5);
        System.out.println(getNum + "번 버스가 운행 중입니다.");
    }

    @Override
    public void checkFuel(int fuel) {
        this.fuel = fuel;
        if (fuel < 10) {
            System.out.println("주유가 필요합니다. 주유량을 확인해 주세요.");
        } else {
            System.out.println("현재 주유량은 " + fuel + "입니다.");
        }
    }

    @Override
    public void speedUp(int x) {
        this.speed = speed;
        speed += x;
        System.out.println("현재 이 버스의 속도는 " + speed + "km/h 입니다.");
    }

    @Override
    public void speedDown(int x) {
        this.speed = speed;
        speed -= x;
        System.out.println("현재 이 버스의 속도는 " + speed + "km/h 입니다.");
    }



}
