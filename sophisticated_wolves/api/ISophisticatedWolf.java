package sophisticated_wolves.api;

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
    EnumWolfSpecies getSpeciesByBiome();

    /*
     * reads data for species
     */
    EnumWolfSpecies getSpecies();

    /*
     * modifies data for species
     */
    void updateSpecies(EnumWolfSpecies species);

}
