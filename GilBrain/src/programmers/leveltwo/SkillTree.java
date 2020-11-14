package programmers.levelone;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

//https://programmers.co.kr/learn/courses/30/lessons/49993
final class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        int skillsLength = skill.length();

        boolean[] isLearnedSkillArr = new boolean[skillsLength];

        Map<Character, Integer> skillTreeMap = new TreeMap<>();

        for (int i = 0; i < skillsLength; i++) {
            skillTreeMap.put(skill.charAt(i), i);
        }

        for (int i = 0; i < skill_trees.length; i++) {
            String skillTree = skill_trees[i];
            for (int k = 0; k < skillsLength; k++) {
                isLearnedSkillArr[k] = false;
            }

            for (int j = 0; j < skillTree.length(); j++) {
                char skillChar = skillTree.charAt(j);

                if (skillTreeMap.containsKey(skillChar)) {
                    int skillIndex = skillTreeMap.get(skillChar);
                    if (skillIndex == 0) {
                        isLearnedSkillArr[0] = true;
                    } else {
                        if (isLearnedSkillArr[skillIndex - 1])
                            isLearnedSkillArr[skillIndex] = true;
                        else {

                            break;
                        }

                    }
                }
                if (j == skillTree.length() - 1) {
                    answer++;
                }

            }
        }

        return answer;
    }
}

public class SkillTree {

}
