import ItemInfo.*;
import org.junit.Test;
import service.BootProgram;

public class TestExercise {

    @Test
    public void beginTheParam(){
        BootProgram bootProgram = new BootProgram();

        bootProgram
                .add(new KuoXiongItem(30, "", 0))
                .add(new TaiTuiItem(60, "", 0))
                .add(new ChaJiaoItem(30, "", 0))
                .add(new QianTiaoItem(30, "", 0));

        bootProgram.begin(3, "");
    }
}
