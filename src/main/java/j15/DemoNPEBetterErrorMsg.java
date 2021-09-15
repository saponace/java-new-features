package j15;

import java.util.Set;

public class DemoNPEBetterErrorMsg {

    record Pants(String color) { }
    record Referee(Pants pants) { }
    record Game(Referee referee) { }

    public static void main(String[] args) {

        var game1 = new Game(new Referee(new Pants("blue")));
        var game2 = new Game(new Referee(null));

        var games = Set.of(game1, game2);

        games.forEach(g -> System.out.println(g.referee.pants.color));
    }
}
