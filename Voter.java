public class Voter {
                    int age;
                
                    Voter(int age) {
                        this.age = age;
                    }
                
                    void checkEligibility() {
                        if (age >= 18) {
                            System.out.println("Eligible");
                        } else {
                            System.out.println("Not eligible");
                        }
                    }

                    public static void main(String[] args) {
                        Voter v = new Voter(20);
                        v.checkEligibility();
                    }
                }
                