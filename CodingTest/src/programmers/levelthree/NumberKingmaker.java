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
            
            System.out.print("ó�� : k ��ŭ�־��ֱ�" + findMinBox[i]);
            //System.out.println("�ּҰ� : " + min[0] + " ��ġ : " + min[1]);
        }
        
        Arrays.sort(findMinBox);
        
        System.out.println();
        
        for(int z = 0 ; z<k; z++){
                
               
                System.out.print("ó�� ��Ʈ�� ���� :");
                
                System.out.print(findMinBox[z]);
            }
        
        
        
        int count = 0;
        
        int temp = 0;
        
        int next = 0;
        
        for(int j = 0 ; j < k-1; j++){
            

            
            strBuf.deleteCharAt(strBuf.indexOf(Integer.toString(findMinBox[0])));
            
            //number.indexOf(Integer.toString(findMinBox[0]))
            //System.out.println( " �ڸ��� �� ��ġ :  " + strBuf.indexOf(Integer.toString(findMinBox[0])));
            
            
          
            
            // ���� ���� ����(k + 1���� �þ��) ��° �� �߿���
            // �ּҰ� ������ ã�ƾ� �Ǵµ� ������ �� �ϱ⿡��
            
            
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
            
            
            // findMinBox �迭�� ���� �������� ������� �ϴ� ���� ����?
            
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
                
               
                System.out.print("������ ? :");
                
                System.out.print(findMinBox[c]);
            }
        
        /* 
        
        ���� ���� ���� �����.
        
        
        */
        
        answer = strBuf.toString();
        
        return answer;
    }
}