package AgenciaDivulgaTudo;

public class main {
	
	public static void main(String[] args) 
	{
		
		double investimento = Teclado.leDouble();
		double TotalVisualizacoes = CalculaVisualizacoes(investimento);
		System.out.println(TotalVisualizacoes);
		
	}
		
	
	//Metodo:
	
		public static double CalculaVisualizacoes (double investimento)	{
		
		double visualizacaoPrimeira = investimento * 30;


		double cliquesPrimeira = ConverteVisualizacaoParaCliques(visualizacaoPrimeira);


		double compartilhamentoPrimeira = ConverteCliquesParaCompartilhamentos(cliquesPrimeira);


		double visualizacaoSegunda = ConverteCompartilhamentoParaVisualizacoes(compartilhamentoPrimeira);
		
		
		// PRIMEIRO COMPARTILHAMENTO


		double cliquesSegunda =ConverteVisualizacaoParaCliques(visualizacaoSegunda);


		double compartilhamentoSegunda = ConverteCliquesParaCompartilhamentos(cliquesSegunda);


		double visualizacaoTerceira = ConverteCompartilhamentoParaVisualizacoes(compartilhamentoSegunda);
		
		// SEGUNDO  COMPARTILHAMENTO

		double cliquesTerceira =ConverteVisualizacaoParaCliques(visualizacaoTerceira);


		double compartilhamentoTerceira = ConverteCliquesParaCompartilhamentos(cliquesTerceira);


		double visualizacaoQuarta = ConverteCompartilhamentoParaVisualizacoes(compartilhamentoTerceira);
		
		// TERCEIRO COMPARTILHAMENTO

		double cliquesQuarta =ConverteVisualizacaoParaCliques(visualizacaoQuarta);


		double compartilhamentoQuarta = ConverteCliquesParaCompartilhamentos(cliquesQuarta);


		double visualizacaoQuinta = ConverteCompartilhamentoParaVisualizacoes(compartilhamentoQuarta);

		
		//o mesmo anúncio é compartilhado no máximo 4 vezes em sequência
		
		return visualizacaoPrimeira + visualizacaoSegunda + visualizacaoTerceira + visualizacaoQuarta + visualizacaoQuinta;
		
	}
	public static double ConverteVisualizacaoParaCliques(double visualizacoes) {
		return (visualizacoes/100) * 12;
		
	}
	public static double ConverteCliquesParaCompartilhamentos(double cliques) {
		return (cliques/20) * 3;
		
	}
	public static double ConverteCompartilhamentoParaVisualizacoes(double compartilhamento) {
		return compartilhamento * 40;
	}
}
