package cz.upce.fei.nnptp.zz.entity;

import java.time.LocalDateTime;

/**
 *
 * @author Roman
 */
public class Parameter {

    public static class StandardizedParameters {

        public static final String TITLE = "title";
        public static final String EXPIRATION_DATETIME = "expiration-datetime";
        public static final String WEBSITE = "website";
        public static final String DESCRIPTION = "description";
    }

    // TODO: add support for validation rules
    public static class TextParameter extends Parameter {

        private String value;

        public TextParameter(String value) {
            this.value = value;
        }

        public TextParameter() {
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class DateTimeParameter extends Parameter {

        private LocalDateTime value;

        public DateTimeParameter() {
        }

        public DateTimeParameter(LocalDateTime value) {
            this.value = value;
        }

        public LocalDateTime getValue() {
            return value;
        }

        public void setValue(LocalDateTime value) {
            this.value = value;
        }
    }

    public static class PasswordParameter extends Parameter {

        private String password;

        public PasswordParameter() {
        }

        public PasswordParameter(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }

    public static Parameter getParameter(String type, String value) {
        switch (type) {
            case StandardizedParameters.TITLE:
                return new TextParameter(value);
            case StandardizedParameters.EXPIRATION_DATETIME:
                return new DateTimeParameter(LocalDateTime.parse(type));
            case StandardizedParameters.WEBSITE:
                return new TextParameter(value);
            case StandardizedParameters.DESCRIPTION:
                return new TextParameter(value);
            default:
                return null;
        }
    }
}
