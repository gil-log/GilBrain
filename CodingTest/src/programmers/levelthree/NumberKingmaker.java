package programmers.levelthree;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42883#

public class NumberKingmaker {
	

}




class Solution {
    public String solution(String number, int k) {
        String answer = "";
        
        StringBuffer strBuf = new StringBuffer(number);
        
        int [] findMinBox = new int[k];
        
        for(int i = 0 ; i < k ; i ++){
            findMinBox[i] = (int)number.charAt(i) - 48;
            
            System.out.print("처음 : k 만큼넣어주기" + findMinBox[i]);
            //System.out.println("최소값 : " + min[0] + " 위치 : " + min[1]);
        }
        
        Arrays.sort(findMinBox);
        
        System.out.println();
        
        for(int z = 0 ; z<k; z++){
                
               
                System.out.print("처음 소트로 정렬 :");
                
                System.out.print(findMinBox[z]);
            }
        
        
        
        int count = 0;
        
        int temp = 0;
        
        int next = 0;
        
        for(int j = 0 ; j < k-1; j++){
            

            
            strBuf.deleteCharAt(strBuf.indexOf(Integer.toString(findMinBox[0])));
            
            //number.indexOf(Integer.toString(findMinBox[0]))
            //System.out.println( " 자르는 애 위치 :  " + strBuf.indexOf(Integer.toString(findMinBox[0])));
            
            
          
            
            // 이제 다음 숫자(k + 1개씩 늘어나는) 번째 애 중에서
            // 최소가 누군지 찾아야 되는데 정렬을 또 하기에는
            
            
            next = (int)number.charAt(k+j) - 48;
            
            
            // 1477  > 0477 >
            
            // 123 > 023 > 1? 123> 023 > 023
            for(int t = 1; t<k; t++){
                
                if(findMinBox[t] < next){
                    
                    findMinBox[t-1] = findMinBox[t];
                    
                } else if (findMinBox[t] >= next) {
                    
                    findMinBox[t-1] = next;
                    
                }
                
                
            }
            
             System.out.println();
            
            
            // findMinBox 배열에 저장 마지막에 지워줘야 하는 값이 없다?
            
            // number = 124475893, k = 3
            // 124475893 > 24475893 > 4475893 >  475893
            // 
            

            
        }
        
        
                for(int p = 0 ; p < k ; p ++){
            findMinBox[p] = (int)strBuf.charAt(p) - 48;
            
        }
        
        Arrays.sort(findMinBox);
         strBuf.deleteCharAt(strBuf.indexOf(Integer.toString(findMinBox[0])));
        
        
                    for(int c = 0 ; c <k; c++){
                
               
                System.out.print("순서가 ? :");
                
                System.out.print(findMinBox[c]);
            }
        
        /* 
        
        제일 작은 값을 지운다.
        
        
        */
        
        answer = strBuf.toString();
        
        return answer;
    }
}