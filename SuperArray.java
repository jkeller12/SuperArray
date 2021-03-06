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

  public SuperArray(int initialCapacity)
  {
    if (initialCapacity < 0 )
    {
      throw new IllegalArgumentException ();
    }

    // Create the SuperArray w/ provided starting initialCapacity

    data = new String [initialCapacity];
    size = 0 ;

  }

  public int size()
  {
    return size;
  }

  public boolean add(String element)
  {
    if (size == data.length)
    {
      resize();
    }

    data[size] = element;

    size++;

    return true;
  }

  public String get(int index)
  {
    if (index < 0 || index >= size())
    {
      throw new IndexOutOfBoundsException();
    }

    return data[index];
  }

  public String set(int index, String element)
  {
    if (index < 0 || index >= size())
    {
      throw new IndexOutOfBoundsException();
    }

    String Old_Value = data[index];

    data[index] = element;

    return Old_Value;
  }

  private void resize()
  {
    String[] newData = new String[data.length * 2 + 1];

    for (int i = 0 ; i < data.length; i++)
    {
      newData[i] = data[i];
    }

    data = newData;
  }

  public void clear()
  {
    data = new String[10];
    size = 0 ;
  }

  public boolean isEmpty()
  {
    return size() == 0;
  }



  public String toString()
  {
    String Return_String = "[";

    for (int i = 0 ; i < size(); i++)
    {
      Return_String += data[i];
      if (i != size()-1)
      {
        Return_String += ", ";
      }
    }

    Return_String += "]";

    return Return_String;
  }

  public boolean contains(String s)
  {
    for (int i = 0 ; i < size; i++)
    {
      if (data[i].equals(s))
      {
        return true;
      }
    }

    return false;
  }



  public void add(int index, String element)
  { if (index < 0 || index > size)
    {
      throw new IndexOutOfBoundsException ();
    }

    // Inserts specified eleent at the specified position.
    // Shifts the element at the current position and those following o th eirhgt

    if (size == data.length)
    {
      resize();
    }

    for (int i = size; i > index; i --)
    {
      data[i] = data[i-1];
    }

    size ++ ;
    data[index] = element;
  }

  public String remove(int index)
  {
    // Removes the element at x position
    // Shifts the subsquent elemetns ot the left
    // Retursn the element you removed

    if (index < 0 || index >= size)
    {
      throw new IndexOutOfBoundsException ();
    }

    String Return_Value = data[index];

    for(int i = index; i < size -1 ; i++)
    {
      data[i] = data[i+1];
    }

    size -= 1;
    return Return_Value;
  }

  public int indexOf(String s)
  {
    // Returns the index of teh first occurrence of teh element
    // Returns -1 if it doesn't contain

    for (int i = 0 ; i < size; i ++)
    {
      if (data[i].equals(s))
      {
        return i;
      }
    }

    return -1;
  }

  public String[] toArray()
  {
    String[] Return_String = new String[size];

    for(int i = 0; i<size; i++)
    {
      Return_String[i] = data[i];
    }

    return Return_String;
  }

  public int lastIndexOf(String value)
  {
    for (int i = size-1; i >= 0; i--)
    {
      if (data[i].equals(value))
      {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other)
  {
    boolean A = true;
    if(other.size() != size)
    {
      return false;
    }

    for(int i = 0 ; i < size; i ++)
    {
      if (other.get(i).equals(get(i)))
      {
        A = true;
      }
      else
      {
        return false;
      }
    }

    return true;
  }
  
}
