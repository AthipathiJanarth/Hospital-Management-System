/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author athipathi
 */
public class HouseListrender  extends DefaultListCellRenderer{

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            if( value instanceof House ){
                House house=(House) value;
                value= house.getDoorNo()+","+house.getStreetName()+","+house.getCommunity().getCommunityName();
            }
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); 
        
    }
}
