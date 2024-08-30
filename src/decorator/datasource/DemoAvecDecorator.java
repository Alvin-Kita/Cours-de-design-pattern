package decorator.datasource;

public class DemoAvecDecorator {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");
        DataSourceDecorator encoded = new Compressor(new Encryptor(fileDataSource));
        encoded.writeData(salaryRecords);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(fileDataSource.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}