public class Demo{
  // Instance Variables

  // Methods
  public static void removeDuplicates(SuperArray s)
  {
    for (int i = s.size() -1; i >= 0 ; i--)
    {
      if (s.indexOf(s.get(i)) != i)
      {
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b)
  {
    //returns a new superarray that's teh intersection of elements a and b
    // order should be the same as the order of the element of a
    SuperArray Return_SuperArray = new SuperArray();
    for (int i = 0 ; i < a.size(); i++)
    {
      if (b.contains(a.get(i)))
      {
        Return_SuperArray.add(a.get(i));
      }
    }
    return Return_SuperArray;
  }

  public static SuperArray zip(SuperArray a, SuperArray b)
  {
    // Takes 2 superarrays and merges them
    //[a0, b0, a1, b1, a2, b2,...]
    // When there sizes are different, just fill in the resizeTester
    SuperArray ReturnArray = new SuperArray();
    int Smaller_SIZE = (a.size()> b.size()) ? b.size(): a.size();
    int Larger_SIZE = (a.size()> b.size()) ? a.size(): b.size();
    SuperArray Larger = (a.size()> b.size()) ? a: b;
    for (int i = 0; i < Smaller_SIZE; i++)
    {
      ReturnArray.add(a.get(i));
      ReturnArray.add(b.get(i));
    }

    for (int i = Smaller_SIZE; i < Larger_SIZE; i++)
    {
      ReturnArray.add(Larger.get(i));
    }

    return ReturnArray;
  }





  public static void main(String[]args){
      SuperArray words = new SuperArray();
      //grouped to save vertical space
      words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
      words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
      words.add("una");    words.add("ebi");     words.add("toro");

      System.out.println(words);
      //removeDuplicates(words);
      SuperArray WORDSB = new SuperArray();
      //grouped to save vertical space
      WORDSB.add("B0");   WORDSB.add("B1");     WORDSB.add("B2");
    //  WORDSB.add("daba shouldn't be here");

      SuperArray WORDSB1 = new SuperArray();
      //grouped to save vertical space
      WORDSB1.add("A0");   WORDSB1.add("A1");     WORDSB1.add("A2");
      WORDSB1.add("A3");   WORDSB1.add("A4");


      SuperArray wordsA = new SuperArray();
      //grouped to save vertical space
      wordsA.add("kani");   wordsA.add("uni");     wordsA.add("ebi");     wordsA.add("una");
      wordsA.add("una");    wordsA.add("ebi");     wordsA.add("kani");    wordsA.add("una");
      wordsA.add("una");    wordsA.add("ebi");     wordsA.add("toro");


      System.out.println(findOverlap(WORDSB, words));
      System.out.println("Should be true");
      System.out.println(words.equals(wordsA));
      System.out.println("Should be false");
      System.out.println(words.equals(WORDSB));
      System.out.println("ZIP");
      System.out.println(zip(WORDSB1, WORDSB));


      }

  }
