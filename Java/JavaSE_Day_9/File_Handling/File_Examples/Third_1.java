public class Third_1{

    // reading data from the file
    public static void main(String[] args) {
        
        
        // below code for reading the data 
		try(FileReader fr=new FileReader("C:\\Users\\Jishan shaikh\\Desktop\\Practice\\Demo1.txt"))
		{
			File f = new File("C:\\Users\\Jishan shaikh\\Desktop\\Practice\\Demo1.txt");
            int z = (int) f.length();
			char arr1[] = new char[z];
			fr.read(arr1);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		// for displaying the data
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
    }
}