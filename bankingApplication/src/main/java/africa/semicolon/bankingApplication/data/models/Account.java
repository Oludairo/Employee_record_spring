package africa.semicolon.bankingApplication.data.models;

import lombok.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Data
public class Account {
    private final BigDecimal balance = BigDecimal.ZERO;
    private String customerId;
    private String number;
    private AccountType type;
}
