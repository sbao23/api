package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Name implements Serializable {
    private String lastName;
    private String firstName;
    private String title;
}
