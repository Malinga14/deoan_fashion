package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Employees")
public class EmployeeEntity {
    @Id
    private String employeeID;
    private String employeeName;
    private String employeeEmail;
    private String employeePassword;
    private String employeePohoneNo;
    private String employeeNIC;

}
