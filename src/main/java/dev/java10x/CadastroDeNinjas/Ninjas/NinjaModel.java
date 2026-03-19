package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//entity transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;

    // um ou mais ninjas tem apenas 1 missao
    // muitos (nome da classe) para uma (nome da caracteristica)
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreing key - chave estrangeira
    private MissoesModel missoes;

}
