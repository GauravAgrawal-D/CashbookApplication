package Controller;

import Entities.Expenses;
import Service.ExpenseService;

public class ExpenseController {

    public void addExpense(Expenses expenses){
        ExpenseService expenseService=new ExpenseService();
        expenseService.addExpense(expenses);

    }

}
