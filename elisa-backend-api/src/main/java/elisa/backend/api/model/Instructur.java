package elisa.backend.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor@AllArgsConstructor
@Table(name = "instructur")
@Entity
public class Instructur {
  @Id
  private Long id;
  private String name;
  private String address;
  private String phone;

}
