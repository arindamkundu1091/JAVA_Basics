import javax.sound.sampled.*;

public class Sound {

    public void beepSound() {
        System.out.println("Make sound");
        try{
            byte[] buf = new byte[2];
            int frequency = 64100;
            AudioFormat af = new AudioFormat((float) frequency, 16, 1, true, false);
            SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
            sdl.open();
            sdl.start();
            int duration = 1000;
            int numberOfTimeFullSinPerSec = frequency/100;
            for(int i =0; i < duration * (float) frequency/1000 ; i++) {
                float numberOfSamplesToRepresentFulSin = (float) frequency/numberOfTimeFullSinPerSec;
                double angle = i / (numberOfSamplesToRepresentFulSin/2.0) * Math.PI;
                short a = (short) (Math.sin(angle) * 3276);
                buf[0] = (byte) (a & 0xFF);
                buf[1] = (byte) (a>>8);
                sdl.write(buf, 0, 2);
            }
            sdl.drain();
            sdl.stop();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        
        try{
            for(int i = 0; i<6; i++) {
                Thread.sleep(500);
                Sound beep = new Sound();
                beep.beepSound();
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}