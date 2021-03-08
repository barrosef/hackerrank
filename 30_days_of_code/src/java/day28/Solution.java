package day28;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Pattern;

/**
 * <strong>Hacker Rank</strong> challenge <strong>day 28: Regex</strong>, solved using <strong>java 8</strong> programming language
 * 
 * <strong>Challenge</strong>
 * Create regex the check that name and e-mail is valid in lowercase form
 * 
 * @author barrosef@gmail.com
 */
public class Solution {

    /**
     * Regular expression to extract name of e-mail address
     */
    private static final String NAME_RE = "^[a-z0-9_\\-]+$";

    /**
     * Regular expression to extract name of e-mail address
     */
    private static final String EMAIL_RE = "^[\\w-\\.]+@(gmail.)+[\\w-]{2,4}$";

    /**
     * Minimal value to N
     */
    private static final int N_MIN= 2;

    /**
     * Maximum value to N
     */
    private static final int N_MAX= 30;

    /**
     * Print when constraint N_MIN <= n <= N_MAX not compliance
     */
    private static final String N_CONSTRAINT_ERROR_MSG ="n = %o is not compliance with constraint %o <= n <= %o";

    /**
     * 
     */
    private static final String ROLE_CONSTRAINT_ERROR_MSG = "%s is not compliance with regex %s";

    /**
     * Stream to input values
     */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Check constraint N_MIN <= n <= N_MAX
     * 
     * @param n given integer
     * @return N_MIN <= n <= N_MAX;
     */
    private static boolean isValid(int n) {
        return N_MIN <= n && n <= N_MAX;
    }

    /**
     * Parametrized check constraint 
     * 
     * @param value value to matcher
     * @param regex regex to compare
     * @return value matches regex?
     */
    private static boolean isValidRegex(String value, String regex) {
        boolean res = Pattern.compile(regex).matcher(value).matches();
        if ( !res ) {
            System.out.printf(ROLE_CONSTRAINT_ERROR_MSG, value, regex);
        }
        return res;
    }

    /**
     * Constraint <strong>name in lowercase</strong> implementation
     * @param name
     * @return name is valid?
     */
    private static boolean isValidName(String name) {
        return isValidRegex(name, NAME_RE);
    }

    /**
     * Constraint <strong>email in email address format and lowercase</strong> implementation
     * @param name
     * @return email is valid?
     */
    private static boolean isValidEmail(String email) {
        return isValidRegex(email, EMAIL_RE);
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        List<String> names;
        if (isValid(N)) {

            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            names = new Vector<String>();
            
            for (int NItr = 0; NItr < N; NItr++) {
                String nameEmailAddress[] = scanner.nextLine().split(" ");
                if (isValidName(nameEmailAddress[0]) && isValidEmail(nameEmailAddress[1])) {
                    names.add(nameEmailAddress[0]);
                }
            }

            Collections.sort(names);
            names.forEach(name -> System.out.println(name));
            scanner.close();
        } else {
            System.out.printf(N_CONSTRAINT_ERROR_MSG, N_MIN, N_MAX);
        }
    }
}