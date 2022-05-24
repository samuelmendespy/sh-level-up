package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  private Long alunoId;

  @NotEmpty(message = "Preencha o campo corretamente")
  private double peso;

  @NotEmpty(message = "Preencha o campo corretamente")
  private double altura;
}
