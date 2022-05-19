package transport;

public class Main {
        public static void main(String[] args) {
                Bus bus01 = new Bus();
                bus01.checkFuel(60);
                bus01.speedUp(100);
                bus01.speedDown(40);
                bus01.speedUp(10);


                Bus bus02 = new Bus();
                bus02.checkFuel(8);
                bus02.speedUp(20);
                bus02.speedDown(20);


                Taxi taxi01 = new Taxi();
                taxi01.checkFuel(80);
                taxi01.speedUp(80);
                taxi01.speedDown(10);


                Taxi taxi02 = new Taxi();
                taxi02.checkFuel(10);
                taxi02.speedUp(120);
                taxi02.speedDown(80);

        }
}


