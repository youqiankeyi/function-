package service;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class MusicHandleImpl implements MusicHandle {


    public void playMusic(String musicName) {

    }

    public void cutMusic(final String musicName, int beginTime, int endTime) {
        try {
            Path path = Paths.get(musicName);
            Player player = new Player(Files.newInputStream(path));
           new Thread(
                    () -> {
                        try {
                            player.play();
                        } catch (JavaLayerException e) {
                            e.printStackTrace();
                        }
                    }
            ).start();
            TimeUnit.SECONDS.sleep(beginTime);
//            thread.interrupt();
            player.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
