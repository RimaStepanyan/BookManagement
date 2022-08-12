package books.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    private String title;
    private Author author;
    private double count;
    private String genre;
    private double price;
    private User registeredUser;
    private Date registrationDate;


}
