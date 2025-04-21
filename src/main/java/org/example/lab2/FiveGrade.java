package org.example.lab2;
import java.util.Scanner;

public class FiveGrade {

        String[] names = {"James","David","Simon","Peter","Jason"};
        int[][] sheet =new int[5][10];
        int[] answer = {1,2,3,4,1,2,3,4,3,2};
        int[] grade = new int[5];
        int[] count = new int [5] ;

        Scanner s = new Scanner(System.in);

        public FiveGrade(){
            inutSheet();
            correctAnswer();
        }

        public void inutSheet(){
            for(int i=0; i<5 ; i++){
                for(int j=0; j<10; j++){
                    sheet[i][j] = s.nextInt();
                }
            }
        }

        public void correctAnswer(){
            for(int i=0; i<5; i++){
                count[i] =0;
                for(int j =0 ; j<10 ; j++){
                    if(sheet[i][j] == answer[j]) count[i] ++;
                }
                grade[i] = grade(count[i]);
            }
        }

        public int grade(int count){
            if(count>=9) return 1;

            else if (count>=7) return 2;


            return 3;
        }

        public void printInfo(){

            StringBuilder firstName = new StringBuilder();
            StringBuilder secondName = new StringBuilder();
            StringBuilder failName = new StringBuilder();
            int firstCount=0;
            int seconCount=0;
            int failCount=0;

            for(int i=0 ; i<5; i++){
                if(grade[i] ==1){
                    firstName = firstName.append(", ").append(names[i]);
                    firstCount++;
                }

                if(grade[i] ==2){
                    secondName = secondName.append(", ").append(names[i]);
                    seconCount++;
                }
                if(grade[i] ==3){
                    failName = failName.append(", ").append(names[i]);
                    failCount++;
                }
            }

            System.out.printf("1st : %s (%d)\n" ,firstName ,firstCount );
            System.out.printf("2nd : %s (%d)\n" ,secondName ,seconCount );
            System.out.printf("Fail : %s (%d)\n" ,failName ,failCount );
        }

    }

