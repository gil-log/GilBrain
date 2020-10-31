package programmers.levelone;

public class nhn {

}
/*import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

class Main {
  private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
    // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
		
		char [] sits = new char[numOfAllPlayers-1];
		
		// 빠른애들
		Set<Character> set = new HashSet<>();
		
		// 애들 술래 횟수 저장할거임
		Map<Character, Integer> map = new TreeMap<>();
		
		int player = 65;
		for(int i = 0 ; i < numOfAllPlayers; i++){
			map.put((char)player, 0);
			player++;
		}
		
		//빠른 사람들 set에 넣기
		for(int i = 0 ; i < numOfQuickPlayers; i++){
			set.add(namesOfQuickPlayers[i]);
		}
		
		// 게임판 자리 채우기 , 전체인원 -1 개
		for(int i = 0 ; i < numOfAllPlayers - 1 ; i ++){
			sits[i] = (char)(66+i);
		}
		
		// A = 65
		char temp = 'A';
		
		char runner = 'A';
		int index = 0;
		
		map.replace('A', map.get('A')+1);
		
		System.out.println("A의 너 술래 횟수 1회 추가!"+map.get('A'));
		
		// 게임 스타트
		for(int i = 0; i < numOfGames; i++){
			if(numOfMovesPerGame[i] < 0){
				index += numOfMovesPerGame[i]%(numOfAllPlayers - 1);
				if(index<0)
					index += numOfAllPlayers - 1;
				}
			else{
				index += numOfMovesPerGame[i]%(numOfAllPlayers - 1);
				if(index>=numOfAllPlayers - 1)
					index -= numOfAllPlayers - 1;
				}
			
			System.out.println(i+"번째 게임에서는 index 가 : "+index+"임");
			
			// 얘가 빠른애인가?
			if(set.contains(sits[index])){
				map.replace(runner, map.get(runner)+1);
			}
			else{
				temp = sits[index];
				map.replace(sits[index], map.get(sits[index])+1);
				sits[index] = runner;
				runner = temp;
			}
		}
		
		for(int i = 0 ; i < numOfAllPlayers -1; i++){
			System.out.println(sits[i]+" "+ map.get(sits[i]));
		}
		System.out.println(runner+" " + map.get(runner));
  }

  private static class InputData {
    int numOfAllPlayers;
    int numOfQuickPlayers;
    char[] namesOfQuickPlayers;
    int numOfGames;
    int[] numOfMovesPerGame;
  }

  private static InputData processStdin() {
    InputData inputData = new InputData();

    try (Scanner scanner = new Scanner(System.in)) {
      inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

      inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
      System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

      inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.numOfMovesPerGame = new int[inputData.numOfGames];
      String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
      for(int i = 0; i < inputData.numOfGames ; i++){
        inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
      }
    } catch (Exception e) {
      throw e;
    }

    return inputData;
  }

  public static void main(String[] args) throws Exception {
    InputData inputData = processStdin();

    solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
  }
}





import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
  private static void solution(int day, int width, int[][] blocks) {
    // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.

		// 벽돌 + 시멘트가 쌓이는 공간
		int[] nogada = new int[width];
		
		int left = 0;
		int rightMax = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		List<Integer> keySet = new ArrayList<>(map.keySet());
		
			int answer = 0;
			
		for(int i = 0 ; i < day; i ++){
			for(int j = 0 ; j < width; j ++){
				// 매일 들어오는 벽돌을 쌓자
				nogada[j] += blocks[i][j];
				// 첫날에만 put
				if(i == 0){
					map.put(j, nogada[j]);
				} 
				// 다른날에는 replace
				else{
					map.replace(j, nogada[j]);
				}
			}
			
				// 맨 양쪽 끝은 시멘트가 쌓일수 없다
				for(int k = 1; k < width-1; k++){
					left = nogada[k-1];
					// 왼쪽이 든든?
					if(left > nogada[k]){
						rightMax=0;
						for(int l = k; l<width;l++){
							if(rightMax<nogada[l])
								rightMax=nogada[l];
						}
						
						if(left>=rightMax){
							answer+= rightMax-nogada[k];
						}else{
							answer+= left-nogada[k];
						}
					}
				}
			
		}
		
		System.out.println(answer);
		
  }
  
  private static class InputData {
    int day;
    int width;
    int[][] blocks;
  }

  private static InputData processStdin() {
    InputData inputData = new InputData();

    try (Scanner scanner = new Scanner(System.in)) {
      inputData.day = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));      
      inputData.width = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      
      inputData.blocks = new int[inputData.day][inputData.width];
      for (int i = 0; i < inputData.day; i++) {
        String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
        for (int j = 0; j < inputData.width; j++) {
          inputData.blocks[i][j] = Integer.parseInt(buf[j]);
        }
      }
    } catch (Exception e) {
      throw e;
    }

    return inputData;
  }

  public static void main(String[] args) throws Exception {
    InputData inputData = processStdin();

    solution(inputData.day, inputData.width, inputData.blocks);
  }
}

*/


