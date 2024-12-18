package QUIZ.Soal3;

public class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Volume Oppo naik ke: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume--;
            System.out.println("Volume Oppo turun ke: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
