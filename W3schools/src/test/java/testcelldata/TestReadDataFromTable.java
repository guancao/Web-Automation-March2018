package testcelldata;

import org.testng.annotations.Test;
import tabledata.ReadDataFromTable;

public class TestReadDataFromTable extends ReadDataFromTable{

    @Test
    public void read(){
        readData();
    }
}
