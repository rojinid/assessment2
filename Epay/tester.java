package Epay;
 class tester {
	    public static void main(String[] args) {
	        userdetail user = new userdetail(101, "Jack", "jack@dxc.com", 1000);
	        preuser kycuser = new preuser(201, "Jill", "jill@dxc.com", 3000);
	        
	        payment.processPaymentByUser(kycuser, 1500);
	        payment.processPaymentByUser(kycuser, 800);
	        payment.processPaymentByUser(kycuser, 1200);
	    }
	}

