package co.edu.unipiloto.mymessenger;

import java.util.ArrayList;
import java.util.List;

public class Historial {

    public static Historial instance;
    private List<String> mssgs;

    private Historial(){
        mssgs = new ArrayList<>();
    }

    public static Historial getInstance(){
        if(instance==null){
            instance = new Historial();
        }
        return instance;
    }

    public List<String> getMssgs(){
        return mssgs;
    }

    public void addMssgs(String mssg){
        mssgs.add(mssg);
    }
}
