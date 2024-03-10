package projectmanagement.projectmanagement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data
@Table(name="projects")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    public Long id;
    @Column(nullable = false)
    @NotBlank(message = "name is  mandatory")

    public String name;
    @Column(nullable = false)
    @NotBlank(message = "description is mandatory")
    public String description;
@Column(nullable = false)
@NotBlank(message = "priority is mandatory")
    public String priority;


    @JsonFormat(pattern = "MM-dd-yyyy")
    @NotBlank(message = "startDate is mandatory")
    public Date startDate;

    @JsonFormat(pattern = "MM-dd-yyyy")
    @NotBlank(message = "endDate is mandatory")
    public Date endDate;
}
