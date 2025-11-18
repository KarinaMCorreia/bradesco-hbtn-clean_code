import java.util.Date;

@interface PostMapping {
    String value();
}

public class Functions {

    public static class Income {
    }

    public static class Expense {
    }

    public static class User {
        public void setRole(User user) {
        }
    }

    public static class Environment {
    }

    public static class Release {
    }

    public static class IncomeRepository {
        public void save(Income income) {
        }
    }

    public static class ExpenseRepository {
        public void save(Expense expense) {
        }
    }

    public static class UserRepository {
        public User save(User user) {
            return user;
        }
    }

    public static class VersionService {
        public String getVersion() {
            return "1.0.0";
        }
    }

    public static class EnvironmentService {
        public Environment getEnvironment(String version) {
            return new Environment();
        }
    }

    public static class ReleaseService {
        public Release getRelease(String version) {
            return new Release();
        }
    }

    private IncomeRepository inRepo = new IncomeRepository();
    private ExpenseRepository outRepo = new ExpenseRepository();
    private UserRepository userRepository = new UserRepository();
    private VersionService versionService = new VersionService();
    private EnvironmentService environmentService = new EnvironmentService();
    private ReleaseService releaseService = new ReleaseService();

    public void saveIncome(Income income) {
        inRepo.save(income);
    }

    public void saveExpense(Expense expense) {
        outRepo.save(expense);
    }

    @PostMapping("/user")
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void setRole(User user) {
        user.setRole(user);
    }

    public Environment getEnvironment() {
        return environmentService.getEnvironment(getVersion());
    }

    public Release getRelease() {
        return releaseService.getRelease(getVersion());
    }

    private String getVersion() {
        return versionService.getVersion();
    }
}