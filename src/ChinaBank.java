import java.util.Currency;

/**
 * Created by Юрий on 04.09.2016.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission() {
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
