import junit.framework.TestCase;

public class GameTest extends TestCase {

    public void testElementsService() {
        assertEquals("tie",  Game.elementsService(Game.Elements.ROCK, Game.Elements.ROCK));
        assertEquals("tie",  Game.elementsService(Game.Elements.PAPER, Game.Elements.PAPER));
        assertEquals("tie",  Game.elementsService(Game.Elements.SCISSORS, Game.Elements.SCISSORS));
        assertEquals("win",  Game.elementsService(Game.Elements.PAPER, Game.Elements.ROCK));
        assertEquals("win",  Game.elementsService(Game.Elements.ROCK, Game.Elements.SCISSORS));
        assertEquals("win",  Game.elementsService(Game.Elements.SCISSORS, Game.Elements.PAPER));
        assertEquals("lose", Game.elementsService(Game.Elements.ROCK, Game.Elements.PAPER));
        assertEquals("lose", Game.elementsService(Game.Elements.PAPER, Game.Elements.SCISSORS));
        assertEquals("lose", Game.elementsService(Game.Elements.SCISSORS, Game.Elements.ROCK));
    }
}