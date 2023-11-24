package lab.chap04;

import java.util.ArrayList;
import java.util.Scanner;

public class Template_do_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        String str;
        do {
            System.out.println("=======================================================================================================================");
            System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1~1000 3의 배수 출력 || 4. 10개의 정수를 입력받아 그 중 짝수가 몇개인지 출력 || 5. 프로그램 종료");
            System.out.println("=======================================================================================================================");
            System.out.println("위 내용을 선택하세요.");
            str = sc.next();
            a = Integer.parseInt(str.replaceAll("[^0-9]", "0"));
//            a = sc.nextInt();
            if(a == 1) {
                System.out.println("1. 구구단 출력");
                for (int i = 0; i <= 9; i++) {
                    for (int j = 2; j <= 9; j++) {
                        if(i ==0) {
                            System.out.printf("\t%d단\t\t\t", j);
                        } else {
                            System.out.printf("%d * %d = %d\t|\t", j, i, i * j);
                        }
                    }
                    System.out.println();
                }
            } else if(a == 2) {
                System.out.println("2. 19단 출력");
                for(int i = 0;i<20;i++) {
                    for(int j = 1;j<20;j++) {
                        if(i == 0) {
                            if(j <10 ) {
                                System.out.printf("\t%d단\t\t\t\t", j);
                            } else {
                                System.out.printf("\t%d단\t\t\t", j);
                            }
                            continue;
                        }
                        System.out.printf("%d * %d = %d", j, i, j*i);
                        if(i*j >= 100) {
                            System.out.printf("\t\t");
                        } else {
                            System.out.printf("\t\t\t");
                        }
                    }
                    System.out.println();
                }
            } else if(a == 3) {
                System.out.println("3. 1~1000 3의 배수 출력");
                for(int i=0;i<=1000;i++) {
                    if(i%3==0) {
                        System.out.println(i);
                    }
                }
            } else if(a == 4) {
                Scanner sc1 = new Scanner(System.in);
                String ss;
                System.out.println("10개의 정수를 입력해주세요");
                int c = 0;
                for(int i=0;i<10;i++) {
                    ss = sc1.next().replaceAll("[^0-9^-]", "0");
                    int aaa = Integer.parseInt(ss);

                    if(aaa % 2 == 0 && aaa > 0) {
                        c++;
                    }
                }
                System.out.println("짝수의 갯수는 " + c + "입니다.");

            }else if(a == 5) {
                System.out.println("5. 프로그램 종료");
                break;
            } else {
                System.out.println(a);
                System.out.println("잘못된 입력");
            }
        } while (true);

        sc.close();
    }
}
