package codewars.lvl8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BanjoTest {

    @Test
    void PeopleThatPlayBanjo() {
        assertEquals("Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"), "Nope!");
        assertEquals("Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"), "Nope!");
        assertEquals("rolf plays banjo", Banjo.areYouPlayingBanjo("rolf"), "Nope! Remember lower case counts, too!");
        assertEquals("bravo does not play banjo", Banjo.areYouPlayingBanjo("bravo"), "Nope!");
    }
}