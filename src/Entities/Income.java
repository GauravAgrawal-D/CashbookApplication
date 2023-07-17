package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Income {
    private int id;
    private String title;
    private int amount;
    private LocalDate date;
    private String notes;
}
