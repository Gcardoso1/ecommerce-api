package br.com.letscode.loja.letscode.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm_product")
    private String name;

    @Column(name = "qtd_estoque")
    private Long quantidadeEstoque;

    private BigDecimal price;

    @Embedded
    private ProductCategory category;


}