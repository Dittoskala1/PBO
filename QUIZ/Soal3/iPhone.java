package QUIZ.Soal3;

public class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Volume iPhone naik ke: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume--;
            System.out.println("Volume iPhone turun ke: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
