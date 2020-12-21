import ItemInfo.*;
import org.junit.Test;
import service.BootProgram;

public class TestExercise {

    @Test
    public void beginTheParam(){
        BootProgram bootProgram = new BootProgram();

        bootProgram
                .add(new BaseItem("KuoXiong",30, "", 0))
                .add(new BaseItem("TaiTui",60, "", 0))
                .add(new BaseItem("ChaJiao",30, "", 0))
                .add(new BaseItem("QianTiao",30, "", 0));

        bootProgram.begin(3, "");
    }
}
