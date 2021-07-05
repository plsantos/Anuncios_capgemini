package AgenciaDivulgaTudo;


import java.util.Scanner;

/**
 * Classe utilit�ria com m�todos para ler valores a partir do teclado.
 * 
 * @author Bruno Cat�o
 * @since 12/03/2021
 */

	public class Teclado {
	
		private static Scanner scanner = new Scanner(System.in);

		/**
		 * Esse m�todo deve ser utilizado para ler valores textuais (Strings), a partir
		 * do teclado.
		 * 
		 * @return Valor textual digitado no teclado
		 */
		public static String leString() {
			String texto = scanner.nextLine();
			return texto;
		}

		/**
		 * M�todo que l� valores num�ricos inteiros a partir do teclado.
		 * 
		 * @return Valor num�rico inteiro digitado no teclado.
		 */
		public static int leInt() {
			// Esse la�o se repetir� enquanto um n�mero v�lido n�o for digitado
			while (true) {
				String texto = leString();
				try {
					// Caso um n�mero v�lido tenha sido digitado, retorna
					return Integer.parseInt(texto);
				} catch (NumberFormatException ex) {
					// Caso contr�rio, exibe uma mensagem de erro e repete
					System.out.println("O valor digitado n�o � um n�mero inteiro v�lido");
					System.out.print("Tente novamente: ");
				}
			}
		}

		/**
		 * M�todo que l� valores num�ricos decimais a partir do teclado.
		 * 
		 * @return Valor num�rico decimal digitado no teclado.
		 */
		public static double leDouble() {
			// Esse la�o se repetir� enquanto um n�mero v�lido n�o for digitado
			while (true) {
				String texto = leString();
				try {
					// Caso um n�mero v�lido tenha sido digitado, retorna
					return Double.parseDouble(texto);
				} catch (NumberFormatException ex) {
					// Caso contr�rio, exibe uma mensagem de erro e repete
					System.out.println("O valor digitado n�o � um n�mero decimal v�lido");
					System.out.print("Tente novamente: ");
				}
			}
		}

		/**
		 * M�todo de testes demonstrando como deve-se utilizar a classe Teclado
		 */
		public static void main(String[] args) {
			// Como ler valores textuais
			System.out.print("Digite seu nome: ");
			String nome = Teclado.leString();
			System.out.println("Oi " + nome + ", como vai ?");

			// Como ler valores num�ricos inteiros
			System.out.print("Digite a sua idade: ");
			int idade = Teclado.leInt();
			int ano = 2021 - idade;
			System.out.println("Voc� deve ter nascido em " + ano);

			// Como ler valores num�ricos decimais
			System.out.println("Vamos abastecer o carro");
			System.out.print("Quantos litros voc� vai abastecer? ");
			double litros = Teclado.leDouble();
			System.out.print("Qual o valor do litro? ");
			double valorLitro = Teclado.leDouble();
			double total = litros * valorLitro;
			System.out.println("Valor total: R$ " + total);
		}
	}