/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee.management.system;

/**
 *
 * @author maruf
 */
public class FullTimeWorker extends Worker {
    
    public FullTimeWorker(String workerName, String wrokerType, double salaryRate) {
        super(workerName, wrokerType, salaryRate);
        
    }

    public FullTimeWorker() {
        super(null, null, 0);
    }
    
    public void calculateWage() {
        double wage = 0.0;
               
        double offDayWork = super.getWeaklyWork(5) + super.getWeaklyWork(6);
        wage =  40 * getSalaryRate() + offDayWork * getSalaryRate() * 2;
        super.setTotalWage(wage);
        
    }
    
    public void calcu(){
    }
    
}
