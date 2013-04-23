public class RandomNumber
{
  private int lowerBound;
  private int upperBound;
  
  public RandomNumber()
  {
  	lowerBound = 1;
  	upperBound = 10;
  }
  
  public RandomNumber(int lowBound, int upBound)
  {
  	lowerBound  = lowBound;
  	upperBound = upBound;
  }
  
  public int GetARandomNumber()
  {
  	int randomNumber;
  	randomNumber = lowerBound + (int) (Math.random() * upperBound );
  	return randomNumber;
  }
  

}
