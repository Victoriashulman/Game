public class Main
{
    public static void main(String[] args)
    {
       //test case 1a
        Game one = new Game();
        one.getLevel(1).reachGoal();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).reachGoal();
        one.getLevel(3).setPoints(500);
        one.makeBonus();
        System.out.println(one.getScore());
        //test case 2a
        Game two = new Game();
        two.getLevel(1).reachGoal();
        two.getLevel(1).setPoints(200);
        two.getLevel(2).reachGoal();
        two.getLevel(2).setPoints(100);
        two.getLevel(3).setPoints(500);
        System.out.println(two.getScore());
        //test case 3a
        Game three = new Game();
        three.getLevel(1).reachGoal();
        three.getLevel(1).setPoints(200);
        three.getLevel(2).setPoints(100);
        three.getLevel(3).reachGoal();
        three.getLevel(3).setPoints(500);
        three.makeBonus();
        System.out.println(three.getScore());
        //test case 4a
        Game four = new Game();
        four.getLevel(1).setPoints(200);
        four.getLevel(2).reachGoal();
        four.getLevel(2).setPoints(100);
        four.getLevel(3).reachGoal();
        four.getLevel(3).setPoints(500);
        System.out.println(four.getScore());
        //test case 1b
        Game five = new Game();
        System.out.println(five.playManyTimes(4));
    }
}
