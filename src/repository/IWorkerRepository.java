/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author A
 */
import java.util.ArrayList;
import model.History;
import model.Worker;

public interface IWorkerRepository {

    void addWorker(ArrayList<Worker> workers);

    void changeSalary(ArrayList<Worker> workers, ArrayList<History> historys, int status);

    void printListHistory(ArrayList<History> historys);

    Worker getWorkerByCode(ArrayList<Worker> workers, String id);

    String getCurrentDate();

    void printHistory(History history);

}
