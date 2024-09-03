package gianlucamessina.BE_U2_S1_L2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Alimento {
protected String nome;
protected int calorie;
protected double prezzo;
}
