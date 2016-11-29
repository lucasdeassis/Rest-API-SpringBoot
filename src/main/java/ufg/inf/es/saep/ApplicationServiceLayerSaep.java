package ufg.inf.es.saep;

import java.io.InputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Service
public interface ApplicationServiceLayerSaep {
	public InputStream parecerAsHtml(Long idDocumento);

	public InputStream parecerAsPdf(Long idDocumento);

	public InputStream radocAsHtml(Long idDocumento);

	public InputStream radocAsPdf(Long idDocumento);

	// futuro criarPontuaçao
	public boolean criarParecer(Long idDocumento, InputStream parecer);

	public boolean criarRadoc(Long idDocumento, InputStream radoc);

	
	public int obterTamanhoParecer(Long idDocumento);
	
	public int obterTamanhoRadoc(Long idDocumento);

    public int obterTamanhoResolucao(Long idDocumento);
    
    public boolean deletarParecer(Long idDocumento);
    
    public boolean deletarRadoc(Long idDocumento);
    
    public InputStream observacoesAsJson(Long idDocumento);
    
    public int obterTamanhoObservacoes(Long idParecer);
    
    public InputStream obterResolucao(Long idDocumento);
    
    public boolean criarResolucao(Long idResolucao, InputStream resolucao);
    
    public boolean deletarResolucao(Long idDocumento);

}
