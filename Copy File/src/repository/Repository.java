/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.DataDao;
import model.Model;

/**
 *
 * @author Admin
 */
public class Repository implements IRepository {
     public void dataCopy(Model data) {
        DataDao.Instance().datadao(data);
    }

    @Override
    public void datadao(Model data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
