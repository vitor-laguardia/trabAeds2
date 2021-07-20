package patricia;
//import patricia.PermutacaoRandomica;
import extraiPalavra.ExtraiPalavra;
import java.util.*;

public class TestaArvorePat {
  public static void main (String[] args) {
    ArvorePatricia dicionario = new ArvorePatricia (128);
//    int min = 32, max = 126;
    
//    char vetor[] = new char[100];

//    for (int i = min; i <= max; i++)
//      vetor[i-min] = (char)i;

     try {
      ExtraiPalavra palavras = new ExtraiPalavra (args[0], args[1]);
		List<String> palavra = new ArrayList<String>();
     // String palavra = null;
		int i = 0;
			palavra.add(palavras.proximaPalavra());
     	for (; ;)
		{
   	if ( palavra.get(i) == null)
				break;
	  		palavra.add(palavras.proximaPalavra());
        	System.out.println ("Palavra"+ (i++) +": " + palavra.get(i-1)); 
		}
//    for (int j = 0; j < i ; j++) { 
//      String c = palavra[j];
//      dicionario.insere (c);
//      System.out.println ("Inseriu chave"+ j + ": " + (int)c + " -- char:" + c);
//    }
//    dicionario.imprime ();


      palavras.fecharArquivos();
    } catch (Exception e) {System.out.println (e.getMessage ());}    
  }
   // @{\it Gera uma permuta\c{c}\~ao aleat\'oria de chaves dos caracteres UNICODE 32 a  126}@
//    PermutacaoRandomica.permut (vetor, vetor.length);
    
    // @{\it Insere cada chave na \'arvore}@
    // @{\it Gera outra permuta\c{c}\~ao aleat\'oria de chaves}@
  //  PermutacaoRandomica.permut (vetor, vetor.length);

    // @{\it Pesquisa cada chave na \'arvore}@
//    for (int i = 0; i < vetor.length; i++) {
//      char c = vetor[i];
//      System.out.println ("Pesquisando chave" + i + ": " + c);
//      dicionario.pesquisa (c);
//    }
  }
//}
