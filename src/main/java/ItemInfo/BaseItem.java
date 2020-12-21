package ItemInfo;

public class BaseItem {

    /**
     * 项目锻炼需要的时间
     */
    private int exerciseTime;

    /**
     * 项目需要播放的音乐
     */
    private String music;

    /**
     * 项目结束后休息时间，默认为0，不休息（部分比较耗体力的运动，需要锻炼完休息一会儿）
     */
    private int restTime;

    public BaseItem(int exerciseTime, String music, int restTime) {
        this.exerciseTime = exerciseTime;
        this.music = music;
        this.restTime = restTime;
    }

    public int getExerciseTime() {
        return exerciseTime;
    }

    public void setExerciseTime(int exerciseTime) {
        this.exerciseTime = exerciseTime;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
}
