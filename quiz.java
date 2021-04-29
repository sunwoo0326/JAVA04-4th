







Scanner sc = new Scanner(System.in);

System.out.println("요소수");
int n = sc.nextInt();
int[] a = new int[n];

for (int i = 0; i <n; i++){
  System.out.print("a["+i+"] : ");
  a[i] = sc.nextInt();
}

System.out.print("삭제를 시작할 인덱스 : ");
int d = sc.nextInt();
System.out.print("삭제할 요소의 개수 : ");
int e = sc.nextInt();

aryRmv(a, d, e);

for (int i = 0; i < n; i++){
  System.out.println("a["+i+"] = "+a[i]);
} 

}//main 닫기

static void aryRmv(int[] a, int d, int e){
  if (e > 0 && d >= 0 && d+e < a.length){
    int d2 = d + e - 1;
    if (d2 > a.length - e - 1)
    d2 = a.length-e-1;
    for(int i = d; i <= d2; i++){
      a[i] = a[i+e];
    }
  }
}
