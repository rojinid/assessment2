package Epay;

public class payment {
	public static void processPaymentByUser(userdetail user, double billAmount) {
        boolean paymentSuccess = user.makePayment(billAmount);
        if (paymentSuccess) {
            System.out.println("Congrats " +user.getUsername() + "Payment of "+ billAmount +" processed successfully");
            System.out.println("Email: " + user.getEmail());
        }
        
         else {
                System.out.println("Sorry "+user.getUsername() +"you dont have enough  balance to make payment");
            }
                System.out.println("Your wallet balance: " + user.getWalletBalance());
                      
            if (user instanceof preuser) {
                preuser kycuser = (preuser) user;
                System.out.println("You have" + kycuser.getRewardPoints()+"Ponits!");
            }
	}
}
         
