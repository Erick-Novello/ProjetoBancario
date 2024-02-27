package ErickNovello.com.github.ProjetoBancario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Email
  private String email;
  private String password;

  @CPF
  private String cpf;
  private LocalDate birthDay;
  private Character gender;
  private LocalDate whenCreated;
  private LocalDate lastLogin;


}
