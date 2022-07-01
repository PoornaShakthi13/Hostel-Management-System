package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class reservation {
    @Id
        private String reservationId;
        private String date;
        private String studentId;
        private String roomId;
        private String payment;



}
