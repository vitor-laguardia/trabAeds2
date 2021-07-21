package extraiPalavra;
public class Palavra
{
	private int row = 0, column = 0;
	private String word;

	public Palavra(String word) 
	{
		this.word = word;
	}

	public void setColumns(int column)
	{
		this.column = column;
	}

	public void setRows(int row)
	{
		this.row = row;
	}

	public int getRow()
	{
		return this.row;
	}

	public int getColumns() 
	{
		return this.column;
	}

	public String getWord()
	{
		return this.word;
	}
}
