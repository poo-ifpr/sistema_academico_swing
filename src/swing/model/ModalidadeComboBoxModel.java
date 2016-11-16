/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.model;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import model.Modalidade;

/**
 *
 * @author everaldo
 */
public class ModalidadeComboBoxModel extends AbstractListModel<Modalidade> 
        implements ComboBoxModel<Modalidade>{

    Modalidade selecionado;

    public ModalidadeComboBoxModel() {
        super();
    }

   
    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public Modalidade getElementAt(int index) {
        if(index == 0){
            return Modalidade.getModalidade(1);
        }
        else{
            return Modalidade.getModalidade(2);
        }
    }

    @Override
    public void setSelectedItem(Object item) {
        selecionado = (Modalidade) item;
    }

    @Override
    public Object getSelectedItem() {
        return selecionado;
    }
    
}
