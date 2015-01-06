/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.management.system;

import java.io.Serializable;


/**
 *
 * @author maruf
 */
public abstract class Worker implements Serializable{

    private String name;
    private String wrokerType;
    private double salaryRate;
    private double[] weaklyWork = new double[7];
    private double totalWage;

    public Worker (){
    }

    public Worker(String workerName, String wrokerType, double salaryRate) {
        this.name = workerName;
        this.wrokerType = wrokerType;
        this.salaryRate = salaryRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWrokerType() {
        return wrokerType;
    }

    public void setWrokerType(String wrokerType) {
        this.wrokerType = wrokerType;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    public double[] getWeaklyWork() {
        return weaklyWork;
    }

    public double getWeaklyWork(int i) {
        return weaklyWork[i];
    }

   

    


    public void setWeaklyWork(double []weaklyWork){
        this.weaklyWork = weaklyWork;
    }
    public double getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(double totalWage) {
        this.totalWage = totalWage;
    }

        
    @Override
    public String toString(){
        String str = "\n"+getName()+"\t " +getWrokerType()+"\t "+getSalaryRate()+
                "$/hr\t" + getWeaklyWork(0)+ "hr\t" +getWeaklyWork(1)+
                "hr\t" +getWeaklyWork(2)+"hr\t" +getWeaklyWork(3)+"hr\t" +getWeaklyWork(4)+
                "hr\t" +getWeaklyWork(5)+"hr\t" +getWeaklyWork(6)+"hr\t $"+getTotalWage();
        return str;
        
    }
    
   
    abstract void calculateWage();

}
