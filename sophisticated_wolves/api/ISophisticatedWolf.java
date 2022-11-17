package sophisticated_wolves.api;

import net.minecraft.world.level.Level;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface ISophisticatedWolf {

    /*
     * determine species based on biome
     */
    EnumWolfSpecies getSpeciesByBiome(Level level);

    /*
     * reads data for species
     */
    EnumWolfSpecies getSpecies();

    /*
     * modifies data for species
     */
    void updateSpecies(EnumWolfSpecies species);

}
