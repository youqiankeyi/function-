package service;

public interface BootProgram {

    /**
     * @param delayTime 每个项目后结束后开启下一个项目的延时时间
     * @param music 准备提示音乐
     */
    public void begin(int delayTime, String music);


}
