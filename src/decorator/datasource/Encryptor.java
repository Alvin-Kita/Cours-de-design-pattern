package decorator.datasource;

import java.util.Base64;

/**
 * Classe réalisant du cryptage.
 */
public class Encryptor extends DataSourceDecorator {

    /**
     * Constructeur.
     *
     * @param source la source de données
     */
    public Encryptor(DataSource source) {
        super(source);
    }

    /**
     * Écrit des données cryptées.
     *
     * @param data les données à écrire
     */
    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    /**
     * Lit des données cryptées.
     *
     * @return les données à lire
     */
    @Override
    public String readData() {
        return decode(super.readData());
    }

    public String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    public String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}