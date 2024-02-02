package sunbase.base.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;


@Entity
@Table(name="customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {


    @Id

    @UuidGenerator(style =UuidGenerator.Style.RANDOM)
    private UUID id;

    private String first_name;

    private String last_name;

    private String address;
    private  String city;

    private  String email;

    private int phone;
}
