package MyNoteBook;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(19.9, "10/10", "IPS");
        Keyboard keyboard = new Keyboard(true, false);
        Ram ram = new Ram(1000, "10/10");
        Ssd ssd = new Ssd(2000, 3);
        UsbPort usbPort = new UsbPort(3.0, 666);
        Computer computer = new Computer("Lenovo", "Black", "RTX", display, keyboard, ram, ssd, usbPort);
        computer.info();
    }
}
