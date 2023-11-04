/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Model;
import repository.Repository;

/**
 *
 * @author Admin
 */
public class Manager {

    protected Repository repo;
    protected Model data;

    public Manager() {
        repo = new Repository();
        data = new Model();
    }

    public void run() {
        repo.dataCopy(data);
    }

}
