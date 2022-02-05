import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int math, turkish, physics, chemistry, music;
        double counter= 0, Total=0;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your Math test score? ");
        math= input.nextInt();
        if (!(math<=0 || math >= 100)){
            Total+=math;
            counter++;

    }

        System.out.println("What is your Turkish test score? ");
        turkish= input.nextInt();
        if (!(turkish<=0 || turkish >= 100)) {
            Total+=turkish;
            counter++;
    }

        System.out.println("What is your Physics test score? ");
        physics= input.nextInt();
        if (!(physics<=0 || physics>=100) ){
            Total+=physics;
            counter++;
    }

        System.out.println("What is your Chemistry test score? ");
        chemistry= input.nextInt();
        if (!(0<=chemistry || chemistry>=100)) {
            Total+=chemistry;
            counter ++;
    }

        System.out.println("What is your Music test score?");
        music= input.nextInt();
        if (!(music <= 0 || music>= 100)) {
            Total+=music;
            counter++;
    }

        double average = Total / counter ;
        System.out.println("Your avarage test score :"+ average);

        String i = average >= 55 ? "You passed the class" : "You failed the class";
        System.out.println(i);

    }


}
