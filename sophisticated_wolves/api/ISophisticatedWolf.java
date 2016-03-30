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
    public EnumWolfSpecies getSpeciesByBiome();

    /*
     * reads data for species
     */
    public EnumWolfSpecies getSpecies();

    /*
     * modifies data for species
     */
    public void updateSpecies(EnumWolfSpecies species);
}
