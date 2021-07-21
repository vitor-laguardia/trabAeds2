package extraiPalavra;
public class TestaExtraiPalavra {
  public static void main (String[] args) {
    try {
      ExtraiPalavra palavras = new ExtraiPalavra (args[0], args[1]);
      String palavra = null; int i = 1;
      while ((palavra = palavras.proximaPalavra())!=null)
		{
			if (palavra == " ")
				System.out.println("achamos espaço");
			if (palavra == "\n")
				System.out.println("achamos quebra de linha");

       // System.out.println ("Palavra"+ (i++) +": " + palavra); 
		}
		//System.out.println(palavras.count);
      palavras.fecharArquivos();
    } catch (Exception e) {System.out.println (e.getMessage ());}    
  }
}
