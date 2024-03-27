package LCD;

import java.util.Scanner;

public class mainLcd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan status LCD (mati/menyala/freeze): ");
        String status = scanner.nextLine();

        System.out.println("Masukkan volume LCD (0-100): ");
        int volume = scanner.nextInt();

        System.out.println("Masukkan kecerahan LCD (0-100): ");
        int brightness = scanner.nextInt();

        System.out.println("Pilih kabel untuk LCD (1: HDMI, 2: DVI, 3: VGA, 4: Display Port): ");
        int cable = scanner.nextInt();

        lcdSekar lcd1 = new lcdSekar (status, volume, brightness, "");
        lcd1.turnOff();
        lcd1.turnOn();
        lcd1.setCable();
        lcd1.cableDown();
        lcd1.cableUp();
        lcd1.setVolume(volume);
        lcd1.volumeDown();
        lcd1.volumeUp();
        lcd1.freeze();
        lcd1.setBrightness(brightness);
        lcd1.brightnessDown();
        lcd1.brightnessUp();
        lcd1.displayMessage();
    }
}
