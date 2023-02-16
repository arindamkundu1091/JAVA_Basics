import java.util.Scanner;

class VISACard {
    String holderName;
    String ccv;

    public double computeRewardPoints(String purchaseType, double amount) {
        double reward = amount * 0.01;
        return reward;
    }
}

class HPVISACard extends VISACard {
    public double computeRewardPoints(String purchaseType, double amount) {
        double reward = super.computeRewardPoints(purchaseType, amount);
        if (purchaseType.equals("fuel")) {
            reward = reward + 10;
            return reward;
        } else {
            return reward;
        }
    }
}

public class Card_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer t = sc.nextInt();
        sc.nextLine();
        String holderName = sc.nextLine();
        String ccv = sc.nextLine();
        double amount = sc.nextDouble();
        sc.nextLine();
        String type = sc.nextLine();
        switch (t) {
            case 1: {
                VISACard vc = new VISACard();
                double reward = vc.computeRewardPoints(type, amount);
                System.out.println(reward);
            }
                break;
            case 2: {
                HPVISACard hvc = new HPVISACard();
                double reward = hvc.computeRewardPoints(type, amount);
                System.out.println(reward);
            }
                break;
        }
        sc.close();
    }
}
