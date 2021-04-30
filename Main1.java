class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("문자열 s1:");
    String s1 = sc.next();
    System.out.print("문자열 s2:");
    String s2 = sc.next();
  
    int idx = s1.indexOf(s2);
    if (idx==-1)
      System.out.println("s1안에 s2가 포함되어있지 않습니다. ");
    else{
          System.out.println(s1);
          System.out.println(idx);
  
  
    }
  
  }
  }
  