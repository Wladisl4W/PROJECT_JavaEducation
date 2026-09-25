import java.util.HashSet;
import java.util.Set;

public class SkillBook {
    private final Set<String> skills = new HashSet<>();

    boolean learnSkill(String skill) {
        return skills.add(skill);
    }

    boolean hasSkill(String skill) {
        return skills.contains(skill);
    }

    boolean forgetSkill(String skill) {
        return skills.remove(skill);
    }

    void printSkills() {
        if (skills.isEmpty()) {
            System.out.println("Навыков нет!");
            return;
        }
        for (String skill : skills) {
            System.out.println(skill);
        }
    }

    int getSkillsCount() {
        return skills.size();
    }
}
