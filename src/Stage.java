import java.io.Serializable;

/**
 * Stage hold a name.
 * 
 * @author Joshua
 * @version 1.0
 *
 */
public class Stage implements Serializable
{

	private String name;
	
	public Stage()
	{
		
	}
	
	/**
	 * 
	 * @param n - name of the stage
	 */
	public Stage(String n)
	{
		name = n;
	}
	
	
	
	
	
	/**
	 * @return name of stage
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @param n name of stage
	 */
	public void setName(String n)
	{
		name = n;
	}
	
}
