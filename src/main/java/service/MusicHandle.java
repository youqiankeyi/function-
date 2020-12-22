package service;

public interface MusicHandle {

    public void playMusic(String musicName);

    /**
     * 截取音乐的播放长度，主要是播放高潮部分
     *
     * @param musicName
     */
    public void cutMusic(String musicName, int beginTime, int endTime);
}
