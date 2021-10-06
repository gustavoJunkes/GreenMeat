//package modelo.dao.fob;
//
//public class Fob {
//	
//public static void main(String []args) {​​
//
//private double valor_produto_mercado_interno;
//private double lucro_pretendido_mercado_interno;
//private String moeda;
//private double Despesas_ocorridas_mercado_interno_venda_produto;
//private double Despesas_intermediarios_em_servicos_mercado_interno;
//private double Despesas_intermediarios_em_servicos_mercado_externos;
//private double Despesas_com_despacho_exportacao;
//private double Despesas_com_transporte_ate_porto_origem;
//private double Despesas_portuarias;
//
//
//double valor_produto_mercado_internosemIPI;
//double valorIPI;
//
//double valorPIS;
//double valorCOFINS;
//double valorICMS;
//double valorLPMI;
//
//double base1;
//
//double base2;
//
////transforrmar em dolar
//double valorBase2EmMoeda;
//
//
//​​​​
//public class CalculoFOB {​​
//​​
//
//
//float A = 100 + IPI;
//
//double VPMIsemIPI = VPMI / A;
//double valorIPI = IPI - VPMIsemIPI;
//
//double valorPIS = VPMIsemIPI * (IPI / 100);
//double valorCOFINS = VPMIsemIPI * (COFINS / 100);
//double valorICMS = VPMIsemIPI * (ICMS / 100);
//double valorLPMI = VPMI * (LPMI / 100);
//
//double base1 = VPMIsemIPI - valorPIS - valorCOFINS - valorICMS - valorLPMI;
//
//double base2 = base1 - DOMIVP - DISMI;
//
//// transforrmar na moeda
//double valorBase3 = base2 / valorMoeda;
//
//double total = (DISMI + DDE + DTPO + DP) + valorBase3;
//
//double POMEP = 100 % -LPME;
//double c = total * LPME;
//double d = c / POMEP;
//
//double fob = total + d;
//
//
//
//}​​
//}​​​