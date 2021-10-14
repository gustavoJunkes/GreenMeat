package modelo.entidade.calculo;

public class CalculoFob {

	private double valor_produto_mercado_interno;
	private double lucro_pretendido_mercado_interno;
	private double lucro_pretendido_mercado_externo;
	private String moeda;
	private double Despesas_ocorridas_mercado_interno_venda_produto;
	private double Despesas_intermediarios_em_servicos_mercado_interno;
	private double Despesas_intermediarios_em_servicos_mercado_externos;
	private double Despesas_com_despacho_exportacao;
	private double Despesas_com_transporte_ate_porto_origem;
	private double Despesas_portuarias;
	private float valorMoeda;
	private double valor_produto_mercado_interno_semIPI;
	private double valorIPI;
	private double valorPIS;
	private double valorCOFINS;
	private double valorICMS;
	private float valorLucroPretendidoMercadoInterno;
	private float resultadoProdutoSemImpostosSemLucroMercadoInterno;
	private float segundaBaseCalculo;
	private float segundaBaseCalculo_No_ValorMoeda;
	private float usdTotal;

	public double getValor_produto_mercado_interno() {
		return valor_produto_mercado_interno;
	}

	public void setValor_produto_mercado_interno(double valor_produto_mercado_interno) {
		this.valor_produto_mercado_interno = valor_produto_mercado_interno;
	}

	public double getLucro_pretendido_mercado_interno() {
		return lucro_pretendido_mercado_interno;
	}

	public void setLucro_pretendido_mercado_interno(double lucro_pretendido_mercado_interno) {
		this.lucro_pretendido_mercado_interno = lucro_pretendido_mercado_interno;
	}

	public double getLucro_pretendido_mercado_externo() {
		return lucro_pretendido_mercado_externo;
	}

	public void setLucro_pretendido_mercado_externo(double lucro_pretendido_mercado_externo) {
		this.lucro_pretendido_mercado_externo = lucro_pretendido_mercado_externo;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public double getDespesas_ocorridas_mercado_interno_venda_produto() {
		return Despesas_ocorridas_mercado_interno_venda_produto;
	}

	public void setDespesas_ocorridas_mercado_interno_venda_produto(
			double despesas_ocorridas_mercado_interno_venda_produto) {
		Despesas_ocorridas_mercado_interno_venda_produto = despesas_ocorridas_mercado_interno_venda_produto;
	}

	public double getDespesas_intermediarios_em_servicos_mercado_interno() {
		return Despesas_intermediarios_em_servicos_mercado_interno;
	}

	public void setDespesas_intermediarios_em_servicos_mercado_interno(
			double despesas_intermediarios_em_servicos_mercado_interno) {
		Despesas_intermediarios_em_servicos_mercado_interno = despesas_intermediarios_em_servicos_mercado_interno;
	}

	public double getDespesas_intermediarios_em_servicos_mercado_externos() {
		return Despesas_intermediarios_em_servicos_mercado_externos;
	}

	public void setDespesas_intermediarios_em_servicos_mercado_externos(
			double despesas_intermediarios_em_servicos_mercado_externos) {
		Despesas_intermediarios_em_servicos_mercado_externos = despesas_intermediarios_em_servicos_mercado_externos;
	}

	public double getDespesas_com_despacho_exportacao() {
		return Despesas_com_despacho_exportacao;
	}

	public void setDespesas_com_despacho_exportacao(double despesas_com_despacho_exportacao) {
		Despesas_com_despacho_exportacao = despesas_com_despacho_exportacao;
	}

	public float getValorMoeda() {
		return valorMoeda;
	}

	public void setValorMoeda(float valorMoeda) {
		this.valorMoeda = valorMoeda;
	}

	public double getValor_produto_mercado_interno_semIPI() {
		return valor_produto_mercado_interno_semIPI;
	}

	public void setValor_produto_mercado_interno_semIPI(double valor_produto_mercado_interno_semIPI) {
		this.valor_produto_mercado_interno_semIPI = valor_produto_mercado_interno_semIPI;
	}

	public double getValorIPI() {
		return valorIPI;
	}

	public void setValorIPI(double valorIPI) {
		this.valorIPI = valorIPI;
	}

	public double getValorPIS() {
		return valorPIS;
	}

	public void setValorPIS(double valorPIS) {
		this.valorPIS = valorPIS;
	}

	public double getValorCOFINS() {
		return valorCOFINS;
	}

	public void setValorCOFINS(double valorCOFINS) {
		this.valorCOFINS = valorCOFINS;
	}

	public double getValorICMS() {
		return valorICMS;
	}

	public void setValorICMS(double valorICMS) {
		this.valorICMS = valorICMS;
	}

	public float getValorLucroPretendidoMercadoInterno() {
		return valorLucroPretendidoMercadoInterno;
	}

	public void setValorLucroPretendidoMercadoInterno(float valorLucroPretendidoMercadoInterno) {
		this.valorLucroPretendidoMercadoInterno = valorLucroPretendidoMercadoInterno;
	}

	public float getResultadoProdutoSemImpostosSemLucroMercadoInterno() {
		return resultadoProdutoSemImpostosSemLucroMercadoInterno;
	}

	public void setResultadoProdutoSemImpostosSemLucroMercadoInterno(
			float resultadoProdutoSemImpostosSemLucroMercadoInterno) {
		this.resultadoProdutoSemImpostosSemLucroMercadoInterno = resultadoProdutoSemImpostosSemLucroMercadoInterno;
	}

	public float getSegundaBaseCalculo() {
		return segundaBaseCalculo;
	}

	public void setSegundaBaseCalculo(float segundaBaseCalculo) {
		this.segundaBaseCalculo = segundaBaseCalculo;
	}

	public float getSegundaBaseCalculo_No_ValorMoeda() {
		return segundaBaseCalculo_No_ValorMoeda;
	}

	public void setSegundaBaseCalculo_No_ValorMoeda(float segundaBaseCalculo_No_ValorMoeda) {
		this.segundaBaseCalculo_No_ValorMoeda = segundaBaseCalculo_No_ValorMoeda;
	}

	public float getUsdTotal() {
		return usdTotal;
	}

	public void setUsdTotal(float usdTotal) {
		this.usdTotal = usdTotal;
	}

	public double getDespesas_com_transporte_ate_porto_origem() {
		return Despesas_com_transporte_ate_porto_origem;
	}

	public void setDespesas_com_transporte_ate_porto_origem(double despesas_com_transporte_ate_porto_origem) {
		Despesas_com_transporte_ate_porto_origem = despesas_com_transporte_ate_porto_origem;
	}

	public double getDespesas_portuarias() {
		return Despesas_portuarias;
	}

	public void setDespesas_portuarias(double despesas_portuarias) {
		Despesas_portuarias = despesas_portuarias;
	}

	public CalculoFob(double valor_produto_mercado_interno,double lucro_pretendido_mercado_interno,
	double lucro_pretendido_mercado_externo, String moeda,
	double Despesas_ocorridas_mercado_interno_venda_produto,
	double Despesas_intermediarios_em_servicos_mercado_interno,
    double Despesas_intermediarios_em_servicos_mercado_externos,
    double Despesas_com_despacho_exportacao,
    double Despesas_com_transporte_ate_porto_origem,
    double Despesas_portuarias) {
		setValor_produto_mercado_interno(valor_produto_mercado_interno);
		setLucro_pretendido_mercado_interno(lucro_pretendido_mercado_interno);
		setLucro_pretendido_mercado_externo(lucro_pretendido_mercado_externo);
		setMoeda(moeda);
		setDespesas_intermediarios_em_servicos_mercado_interno(Despesas_intermediarios_em_servicos_mercado_interno);
		setDespesas_intermediarios_em_servicos_mercado_externos(Despesas_intermediarios_em_servicos_mercado_externos);
		setDespesas_com_despacho_exportacao(Despesas_com_despacho_exportacao);
		setDespesas_com_transporte_ate_porto_origem(Despesas_com_transporte_ate_porto_origem);
		setDespesas_portuarias(Despesas_portuarias);
				
	}
	
	
	
	
	
}



