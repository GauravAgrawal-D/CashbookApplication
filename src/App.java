import Controller.ExpenseController;
import Entities.Expenses;
import  java.sql.Date;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Expenses expense = acceptExpenseDetailsFromUser();
        ExpenseController expenseController = new ExpenseController();
        expenseController.addExpense(expense);


    }
    private static Expenses acceptExpenseDetailsFromUser() {
        //accept input: expense title, amount, notes, date
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter expense title");
        String title = scanner.nextLine();
        System.out.println("enter expense amount");
        int amount = scanner.nextInt();
        /*System.out.println("enter expense date");
        Date date = Date.valueOf(scanner.nextLine());*/
        System.out.println("enter expense notes");
        String notes = scanner.nextLine();
        Expenses expense = new Expenses();
        expense.setTitle(title);
        expense.setAmount(amount);
        // expense.setDate(date);
        expense.setNotes(notes);
        return expense;
    }

}