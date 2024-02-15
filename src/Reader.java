import java.time.LocalDate;
    public class Reader {
        String fullName;
        String library;
        String   cardNumber;
        LocalDate dateOfBirth;
        String phoneNumber;
        int quantity;
        public Reader(String fullName, String library, String cardNumber, LocalDate dateOfBirth, String phoneNumber, int quantity) {
            this.fullName = fullName;
            this.library = library;
            this.cardNumber = cardNumber;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
            this.quantity = quantity;

        }

        @Override
        public String toString() {
            return "Reader info \n" +
                    "º Full name: " + fullName + '\n' +
                    "º Library: " + library + '\n' +
                    "º Card number: " + cardNumber + '\n' +
                    "º Date of birth: " + dateOfBirth + '\n'+
                    "º Phone number: " + phoneNumber + '\n' +
                    "º Quantity: " + quantity +" books" ;
        }

        public void takeBook(int quantity) {
            System.out.println(fullName + " take " + quantity + " " + (quantity == 1 ? "book" : "books"));
        }

        public void returnBook(int quantity) {
            System.out.println(fullName + " return " + quantity + " " + (quantity == 1 ? "book" : "books"));
        }


    }

