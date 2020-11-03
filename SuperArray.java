public class SuperArray{
  // Instance Variables
  private String[] data;
  private int size; // the current size


  // Constructor
  public SuperArray()
  {
    size = 0 ;
    data = new String [10];

  }

  public int size()
  {
    return size;
  }

  public boolean add(String element)
  {
    data[size] = element;

    size++;

    return true;
  }

  public String get(int index)
  {
    return data[index];
  }

  public String set(int index, String element)
  {

    String Old_Value = data[index];

    data[index] = element;

    return Old_Value;
  }

  private void resize()
  {
    String[] newData = new String[data.length * 2];
    for (int i = 0 ; i < data.length; i++)
    {
      newData[i] = data[i];
    }
    data = newData; 
  }

}
