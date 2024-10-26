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
@Table(name="Suppleirs")
public class SuppleirEntity {
    @Id
    private String suppleirID;
    private String suppleirName;
    private String suppleirEmail;
    private String suppleirPhoneNo;
    private String suppleirNIC;
}
