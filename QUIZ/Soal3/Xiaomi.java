package QUIZ.Soal3;

public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Volume Xiaomi naik ke: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume--;
            System.out.println("Volume Xiaomi turun ke: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
