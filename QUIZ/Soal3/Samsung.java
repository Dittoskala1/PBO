package QUIZ.Soal3;

public class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Volume Samsung naik ke: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume--;
            System.out.println("Volume Samsung turun ke: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
