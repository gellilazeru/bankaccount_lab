import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Anna", "Smith", "26/05/2001", 94858 );
    }

    @Test
    public void canGetFirstName(){
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo("Anna");
    }

    @Test
    public void canGetLastName(){
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Smith");
    }

    @Test
    public void canGetDateOfBirth(){
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("26/05/2001");
    }

    @Test
    public void canGetAccountNumber(){
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(94858);
    }


    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Judie");
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo("Judie");
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Wren");
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Wren");
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("13/06/2001");
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("13/06/2001");
    }

    @Test
    public void canAccountNumber(){
        bankAccount.setAccountNumber(5483);
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(5483);
    }

    @Test
    public void canBalance(){
        bankAccount.deposit(45);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(45);
    }

    @Test
    public void canBalance1(){
        bankAccount.withdrawal(5);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(0);
    }


}
