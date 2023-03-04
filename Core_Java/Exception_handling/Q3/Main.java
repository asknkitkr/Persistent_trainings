package Exception_handling.Q3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the contact details");

            String st = br.readLine();
            String[] str = st.split(",");

            ContactDetail contact = new ContactDetail(str[0], str[1], str[2], str[3], str[4]);
            ContactDetailBO.validate(contact.getMobile(), contact.getAlternateMobile());

            System.out.println(contact);
        } catch (IOException e) {
            System.out.println("Error reading input");
        } catch (DuplicateMobileNumberException e) {
            System.out.println(e.getMessage());
        }

    }
}
