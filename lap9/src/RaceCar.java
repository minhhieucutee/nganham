public class RaceCar  extends  Thread {
    int finish;
    String name;

    RaceCar(int finish, String name) {
        this.finish = finish;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < finish; i++) {
            System.out.println(name + ":" + (i + 1) + "running..");
            try {
                Thread.sleep(Math.round(Math.random() * 5000));

            } catch (Exception e) {
            }
            System.out.println(name + "finished");
        }
    }

  public  class Race {
        public void main(String a[]) {
            RaceCar[] cars = new RaceCar[5];
            cars[0] = new RaceCar(10, "Mario");
            cars[1] = new RaceCar(10, "Songoku");
            cars[2] = new RaceCar(10, "Herman");
            cars[3] = new RaceCar(10, "DORAEON");
            cars[4] = new RaceCar(10, "Hoang Phi Hong");
            for (int i = 0 ; i <5;i++)
                cars[i].start();
        }
    }
}
