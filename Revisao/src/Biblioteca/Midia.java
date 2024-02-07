package Biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Midia {

    private int codigo;
    private boolean emprestado;
    private static final List<Midia> midias = new ArrayList<>();

    public static Midia procurarMidia(int codigo) {
        for (Midia midia: midias) {
            if(midia.codigo == codigo){
                return midia;
            }
        }
        return null;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void alterarEmprestimo(){
        this.emprestado = !this.emprestado;
    }
}