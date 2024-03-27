package LCD;

public class lcdSekar{
    private String status;
    private int volume;
    private int brightness;
    private String cable;
    private int cc;

    public lcdSekar(String status, int volume, int brightness, String cable) {
        this.status = status;
        this.volume = volume;
        this.brightness = brightness;
        this.cable = cable;
    }

    public void turnOff() {
        status = "Mati";
    }

    public void turnOn() {
        status = "Menyala";
    }

    public void freeze() {
        status = "Freeze";
    }

    public void volumeUp() {
        volume++;
            if (volume > 100) {
                this.volume = 100;
            }
        }
    

    public void volumeDown() {
            volume--;
            if (volume < 0) {
                this.volume = 0;
            }
        
    }

    public void setVolume(int volume) {
            if (volume >= 0 && volume <= 100) {
                this.volume = volume;
            }
        }
    

    public void brightnessUp() {
            brightness++;
            if (brightness > 100) {
                this.brightness = 100;
            }
        }
    

    public void brightnessDown() {
            brightness--;
            if (brightness < 0) {
                this.brightness = 0;
            }
        }
    

    public void setBrightness(int brightness) {
            if (brightness >= 0 && brightness <= 100) {
                this.brightness = brightness;
            }
        }
    

    public void cableUp(){
        this.cc++;
        Cek();
        setCable();
    }

    public void cableDown(){
        this.cc--;
        Cek();
        setCable();
    }
    
    public void Cek(){
        if(cc < 1){
            cc += 1;
        }
    }

    public void setCable() {
        switch (cc) {
            case 1:
                cable = "HDMI";
            break;
            case 2:
                cable = "DVI";
            break;
            case 3:
                cable = "VGA";
            break;
            default:
                cable = "Display Port";
            break;
        }
    }

     public void displayMessage(){
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume );
        System.out.println("Brightness: "+ brightness);
        System.out.println("Cable: "+ cable );
    }
}