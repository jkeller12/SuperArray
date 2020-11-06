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
      WORDSB.add("kani");   WORDSB.add("uni");     WORDSB.add("ebi");
      WORDSB.add("daba shouldn't be here");


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


      }

  }
