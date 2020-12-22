import ItemInfo.*;
import org.junit.Test;
import service.BootProgram;
import service.BootProgramImpl;

public class TestExercise {

    @Test
    public void beginTheParam() {
        BootProgram bootProgram = new BootProgramImpl();
        String begin_music = "C:\\Program Files\\WindowsApps\\A-Volute.Nahimic_1.5.2.0_x64__w2gh52qy24etm\\Assets\\MusicSound.mp3";
        String music = "C:\\Program Files\\WindowsApps\\CyberLink.PhotoDirector10EssentialforMSI_10.0.2326.0_x64__jtmmp2jxy9gb6\\PhotoDirector10\\Customizations\\Generic\\Style\\Standard\\Media\\Standard\\Sample Music\\Believe.mp3";
        String music_1 = "C:\\Program Files\\WindowsApps\\CyberLink.PhotoDirector10EssentialforMSI_10.0.2326.0_x64__jtmmp2jxy9gb6\\PhotoDirector10\\Customizations\\Generic\\Style\\Standard\\Media\\Standard\\Sample Music\\Dream.mp3";
        for (int i = 0; i < 3; i++) {
            bootProgram
                    .add(new BaseItem("KuoXiong", 30, music, 2))
                    .add(new BaseItem("TaiTui", 60, music_1, 2))
                    .add(new BaseItem("ChaJiao", 30, music, 2))
                    .add(new BaseItem("QianTiao", 30, music_1, 12));
        }

        bootProgram.begin(3, begin_music);
    }
}
