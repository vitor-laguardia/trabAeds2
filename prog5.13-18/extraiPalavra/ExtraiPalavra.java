package extraiPalavra;
import java.util.StringTokenizer;
import java.io.*;
public class ExtraiPalavra {
  private BufferedReader arqDelim, arqTxt;
  private StringTokenizer palavras;
  private String delimitadores;
  public int count =0;
  public int countColumns = 0;
  private Palavra word;
  private List<Palavra> lista = new List<Palavra>();

  public ExtraiPalavra (String nomeArqDelim, String nomeArqTxt) 
  throws Exception {
    this.arqDelim = new BufferedReader (new FileReader (nomeArqDelim));
    this.arqTxt = new BufferedReader (new FileReader (nomeArqTxt));
    // @{\it Os delimitadores devem estar juntos em uma \'unica linha do arquivo}@ 
    this.delimitadores = arqDelim.readLine() + "\r\n"; 
		System.out.println(this.delimitadores);
    this.palavras = null;
  }  
  public String proximaPalavra () throws Exception{
	 countColumns++;
    if (palavras == null || !palavras.hasMoreTokens()) {
      String linha = arqTxt.readLine();
		count++;	
		countColumns=0;
      if (linha == null) return null; 
      this.palavras = new StringTokenizer (linha, this.delimitadores);
      if (!palavras.hasMoreTokens()) return ""; // @{\it ignora delimitadores}@
    }
//   	teste = this.palavras.nextToken();
//		System.out.println(teste);
	 word = new Palavra(this.palavras.nextToken());
	 word.setColumns(countColumns);
	 word.setRows(count);
	 lista.add(word);
	 System.out.print("coluna " +  word.getColumns() + " ");
	 System.out.print("linha: " + word.getRow() + " ");
	 System.out.print("palavra " + word.getWord() + " ");
	 System.out.println();

    return word.getWord();
  }  
  public void fecharArquivos () throws Exception {
    this.arqDelim.close(); 
    this.arqTxt.close();
  }
  
  public ArrayList<Palavra> getArray()
  {
	return this.lista;
  }

}
