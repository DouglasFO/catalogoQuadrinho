
package br.edu.iff.catalogoQuadrinho.model;

import java.io.Serializable;

public class Item_Colecao implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int id;
    private Item item;
    private Colecao colecao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Colecao getColecao() {
        return colecao;
    }

    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item_Colecao other = (Item_Colecao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
