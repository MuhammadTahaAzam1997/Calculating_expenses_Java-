/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensesstatementeasyways;

/**
 *
 * @author Muhammad Taha Azam
 */
public class ExpensesStatementEasyWays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     CreatingRecords obj=new CreatingRecords();
   obj.employee();
   obj.otherexpense();
   obj.showexpenses();
   obj.EmployeeAttributes(obj.noofemp,obj.sal , obj.n, obj.rent, obj.electricitybill, obj.internetpayment, obj.stationarypayment, obj.otherexpenses);
     
    }
    
}
