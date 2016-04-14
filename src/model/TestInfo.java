package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hepei on 4/10/16.
 */
public class TestInfo {

    private List<String> originalLi;
    private List<String> newLi;

    public TestInfo(){
        this.originalLi = new ArrayList<>();
        this.newLi = new ArrayList<>();

        originalLi.add("TEM LIV 100F");
        originalLi.add("HUM LAB 45%");
        originalLi.add("OXY STG 30%");
        originalLi.add("PRE WEL 14.5psi");
        originalLi.add("SMO COM TRUE");
        originalLi.add("GAS LIV FALSE");
        originalLi.add("WAL LAB 30F");
        originalLi.add("OUT 80F");

    }

    public List<String> getOriginalLi() {
        return originalLi;
    }

    public void setOriginalLi(List<String> originalLi) {
        this.originalLi = originalLi;
    }

    public List<String> getNewLi() {
        return newLi;
    }

    public void setNewLi(List<String> newLi) {
        this.newLi = newLi;
    }
}
