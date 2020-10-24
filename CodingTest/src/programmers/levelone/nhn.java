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
    // TODO: �̰��� �ڵ带 �ۼ��ϼ���. �߰��� �ʿ��� �Լ��� ���������� �����ؼ� ����ϼŵ� �˴ϴ�.
		
		char [] sits = new char[numOfAllPlayers-1];
		
		// �����ֵ�
		Set<Character> set = new HashSet<>();
		
		// �ֵ� ���� Ƚ�� �����Ұ���
		Map<Character, Integer> map = new TreeMap<>();
		
		int player = 65;
		for(int i = 0 ; i < numOfAllPlayers; i++){
			map.put((char)player, 0);
			player++;
		}
		
		//���� ����� set�� �ֱ�
		for(int i = 0 ; i < numOfQuickPlayers; i++){
			set.add(namesOfQuickPlayers[i]);
		}
		
		// ������ �ڸ� ä��� , ��ü�ο� -1 ��
		for(int i = 0 ; i < numOfAllPlayers - 1 ; i ++){
			sits[i] = (char)(66+i);
		}
		
		// A = 65
		char temp = 'A';
		
		char runner = 'A';
		int index = 0;
		
		map.replace('A', map.get('A')+1);
		
		System.out.println("A�� �� ���� Ƚ�� 1ȸ �߰�!"+map.get('A'));
		
		// ���� ��ŸƮ
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
			
			System.out.println(i+"��° ���ӿ����� index �� : "+index+"��");
			
			// �갡 �������ΰ�?
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
    // TODO: �̰��� �ڵ带 �ۼ��ϼ���. �߰��� �ʿ��� �Լ��� ���������� �����ؼ� ����ϼŵ� �˴ϴ�.

		// ���� + �ø�Ʈ�� ���̴� ����
		int[] nogada = new int[width];
		
		int left = 0;
		int rightMax = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		List<Integer> keySet = new ArrayList<>(map.keySet());
		
			int answer = 0;
			
		for(int i = 0 ; i < day; i ++){
			for(int j = 0 ; j < width; j ++){
				// ���� ������ ������ ����
				nogada[j] += blocks[i][j];
				// ù������ put
				if(i == 0){
					map.put(j, nogada[j]);
				} 
				// �ٸ������� replace
				else{
					map.replace(j, nogada[j]);
				}
			}
			
				// �� ���� ���� �ø�Ʈ�� ���ϼ� ����
				for(int k = 1; k < width-1; k++){
					left = nogada[k-1];
					// ������ ���?
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


