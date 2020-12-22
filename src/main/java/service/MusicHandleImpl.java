package service;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;

public class MusicHandleImpl implements MusicHandle {


    public void playMusic(String musicName) {

    }

    public void cutMusic(final String musicName, int beginTime, int endTime) {
        try {
            File file = new File(musicName);
            FileInputStream stream = new FileInputStream(file);
            Player player = new Player(stream);
           new Thread(
                    () -> {
                        try {
                            player.play();
                        } catch (JavaLayerException e) {
                            e.printStackTrace();
                        }
                    }
            ).start();
            Thread.sleep(beginTime * 1000);
//            thread.interrupt();
            player.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
