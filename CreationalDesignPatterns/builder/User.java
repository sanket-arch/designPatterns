package CreationalDesignPatterns.builder;

public class User {

    public final String userId;
    public final String username;
    public final String emailId;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.username = builder.username;
        this.emailId = builder.emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    static class UserBuilder {
        private String userId;
        private String username;
        private String emailId;

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


}
