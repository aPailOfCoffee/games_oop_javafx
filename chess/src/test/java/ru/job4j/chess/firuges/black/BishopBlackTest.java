package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.*;
import static  org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void whenB8ThenPositionB8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B8);
        Cell rsl = bishopBlack.position();
        assertThat(rsl, is(Cell.B8));
    }

    @Test
    public void whenCopyToC7ThenC7() {
        BishopBlack bishop = new BishopBlack(Cell.B8);
        Figure bishopCopy = bishop.copy(Cell.C7);
        Cell rsl = bishopCopy.position();
        assertThat(rsl, is(Cell.C7));
    }

    @Test
    public void whenWayFromC1ToG5ThenD2E3F4G5() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] rsl = bishop.way(Cell.G5);
        Cell[] expected = new Cell[] {
                Cell.D2, Cell.E3, Cell.F4, Cell.G5
        };
        assertArrayEquals(expected, rsl);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayThanImpossibleMove() throws ImpossibleMoveException {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        bishop.way(Cell.D7);
    }
}