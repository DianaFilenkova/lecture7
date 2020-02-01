package lv.diana;

import lv.diana.player.FootballPlayer;

public class TestJava {
    public  static void main(String[]args) {
        FootballPlayer player = new FootballPlayer("Ronaldo", "Forward",7, true, 184, 86);
        System.out.println(player.getName());
        System.out.println(player.getPosition());
        System.out.println(player.getShirtNumber());
        System.out.println(player.isBuild());
        System.out.println(player.getHeight());
        System.out.println(player.getWeight());

        player.setShirtNumber(10);
        System.out.println("------------------------");
        System.out.println(player.getName());
        System.out.println(player.getPosition());
        System.out.println(player.getShirtNumber());
        System.out.println(player.isBuild());
        System.out.println(player.getHeight());
        System.out.println(player.getWeight());


    }
}
