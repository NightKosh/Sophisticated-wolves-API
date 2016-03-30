package sophisticated_wolves.api;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public enum EnumWolfSpecies {
    VANILLA,
    FOREST,
    BLACK,
    BROWN;

    public static EnumWolfSpecies getSpeciesByNum(int num) {
        if (num >= 0 && num < EnumWolfSpecies.values().length) {
            return EnumWolfSpecies.values()[num];
        } else {
            return VANILLA;
        }
    }
}
