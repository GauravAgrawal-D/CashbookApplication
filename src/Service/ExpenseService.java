package Service;

import Dao.ExpencesDao;
import Entities.Expenses;

public class ExpenseService {
    public void addExpense(Expenses expenses){
        ExpencesDao expencesDao=new ExpencesDao();
        expencesDao.addExpences(expenses);
    }
}
