/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadEuroChem;

/**
 *
 * @author phsto
 */
public class Fornecedor {
    private String nameFornecedor;
    private int numeroFornecedor;
    private String numeroCnpj;
    private String dateEmissao;
    private String dataRecebimento;
    
    public Fornecedor(String nomeFornecedor, int numFornecedor, String numCnpj, String dtEmissao, String dtRecebimento){
        this.nameFornecedor = nomeFornecedor;
        this.numeroFornecedor = numFornecedor;
        this.numeroCnpj = numCnpj;
        this.dateEmissao = dtEmissao;
        this.dataRecebimento = dtRecebimento;
    }

    public String getNameFornecedor() {
        return nameFornecedor;
    }

    public int getNumeroFornecedor() {
        return numeroFornecedor;
    }
    public String getNumeroCnpj() {
        return numeroCnpj;
    }

    public String getDateEmissao() {
        return dateEmissao;
    }

    public String getDataRecebimento() {
        return dataRecebimento;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fornecedor fornecedores = (Fornecedor) obj;
        return numeroFornecedor == fornecedores.numeroFornecedor && nameFornecedor.equals(fornecedores.nameFornecedor) && 
                numeroCnpj == fornecedores.numeroCnpj && dateEmissao == fornecedores.dateEmissao && dataRecebimento == fornecedores.dataRecebimento;
    }    
}
