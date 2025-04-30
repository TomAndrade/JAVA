package aulasPraticas.classTester;

import aulasPraticas.academy.interfaces.DatabaseLoader;
import aulasPraticas.academy.interfaces.FileLoader;

public class SobreInterfaces {
    public static void main(String[] args) {
        DatabaseLoader dbloader = new DatabaseLoader();
        FileLoader fileloader = new FileLoader();

        dbloader.carregar();
        fileloader.carregar();

        dbloader.remover();
        fileloader.remover();

        dbloader.checkPermission();
        fileloader.checkPermission();
    }
}
