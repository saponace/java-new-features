package j15;

import java.util.Set;

public class HelloNullHelp {

    record Pants(String s) { }
    record Referee(Pants pants) { }
    record Game(Referee referee) { }

    public static void main(String[] args) {

        var game1 = new Game(new Referee(new Pants("blue")));
        var game2 = new Game(new Referee(null));

        var games = Set.of(game1, game2);

        games.forEach(it -> System.out.println(it.referee.pants.s));
    }
}
