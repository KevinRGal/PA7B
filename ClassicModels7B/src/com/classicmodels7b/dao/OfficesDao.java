/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;
/**
 *
 * @author Kevin
 */
public interface OfficesDao {
    
    //recibe un objeto de tipo OfficeModel y crea una nueva oficina
    //en la base de datos
    public String createOffice(OfficesModel newOffice);
    
    //Devuelve un listado de las oficinas almacenadas en la tabla Office
    public ArrayList<OfficesModel> readOffices();
    
    //Recibe un objeto de tipo OfficeModel y actualiza una officina
    public String updateOffice(OfficesModel auxOfice);
    
    //Borra una oficina de la tabla offices de acuerdo al ID recibido
    public String deleteOffice(String officeCode);
    
    
}
