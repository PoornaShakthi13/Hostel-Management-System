package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class student {
    @Id
    private String studentId;
    private String name;
    private String address;
    private int contactNum;
    private String dob;
    private String gender;
}
