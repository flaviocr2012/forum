package com.alura.forum.config.validacao;

public class ErrodeFormularioDto {

    private String campo;
    private String erro;

    public ErrodeFormularioDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
