package service;

import ItemInfo.BaseItem;

import java.util.LinkedList;
import java.util.Queue;


public class BootProgramImpl implements BootProgram {

    private Queue<BaseItem> list = new LinkedList<BaseItem>();

    private MusicHandle musicHandle = new MusicHandleImpl();

    public void begin(int delayTime, String beginMusic) {
        try {
            BaseItem item = null;
            while((item = list.poll()) != null){
                System.out.println("item = " + item);
                musicHandle.cutMusic(beginMusic, delayTime, 0);
                int exerciseTime = item.getExerciseTime();
                musicHandle.cutMusic(item.getMusic(), exerciseTime, 60 + exerciseTime);
                Thread.sleep(item.getRestTime() * 1000);
            }
        } catch (InterruptedException e) {

        }
    }

    public BootProgram add(BaseItem baseItem) {
        list.offer(baseItem);
        return this;
    }
}
