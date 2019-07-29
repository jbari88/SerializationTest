import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		MyObject myObj = new MyObject(1,"helly",2);
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("file.bin"));
		os.writeObject(myObj);
		os.close();
		

	}

}

class MyObject implements Serializable{
	private int id;
    private String name;
    private int num;

    public MyObject(int id, String name, int num){
		this.id = id;
		this.name=name;
		this.num=num;
	}
}
