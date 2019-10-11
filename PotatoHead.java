
public class PotatoHead
{
	// create instance variables
	private boolean hasEyes;
	private String eyeColor;
	private String eyes;
	private String costume;
	private int arms;
	private String moustache;
	// add one instance variable

	// default constructor
	public PotatoHead()
	{
		// initialize ***ALL*** instance variables here
		hasEyes = false;
		eyeColor = "unknown";
		arms = 0;
		moustache = "null"
	}

	/*
	VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE
	*/
	/* void changeMoustache(String _moustache)
	mutator method for moustache
	@param _moustache give a String*/
	public void changeMoustache(String _moustache)
	{
		moustache = _moustache;
	}
	/* String getEyeColor()
     accessor method for eyeColor
	*/
	public String getEyeColor()
	{
		return eyeColor;
	}
	/*
	  int getNumbOfArms()
	  accessor method for arms
	 */
	public int getNumbOfArms() {
		return arms;
	}
	/*
		in getMoustacheType()
		accessor method for _moustache
		@return moustache
	*/
	public int getMoustacheType()
	{
		return moustache;
	}

	/* void setEyeColor(String someColor)
     MUTATOR METHOD - change an instance variable's value
	*/
	public void setEyeColor(String someColor)
	{
		eyeColor = someColor;
	}
	/* void setNumbOfArms(int numbArms)
	  MUTATOR METHOD - change the number of arms
	 */
	public void setNumbOfArms(int numbArms) {
		arms = numbArms;
	}
	/* String toString()
  *  ACCESSOR METHOD
	*  method to access ***ALL*** instance variables
	*  you should be adding your new instance variable here
	*/
	public String toString()
	{
		String output;
		output =  "Eyes: " + eyes;
		output += "\nCostume: " + costume;
		output += "\nNumber of Arms: " + arms;
		output += "\nMoustache: " + moustache;
		return output;
	}
}
