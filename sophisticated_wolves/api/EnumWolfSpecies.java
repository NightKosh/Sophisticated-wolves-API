package sophisticated_wolves.api;


/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public enum EnumWolfSpecies {
    VANILLA("sophisticated_wolves.wolf_type.vanilla"),
    FOREST("sophisticated_wolves.wolf_type.forest"),
    BLACK("sophisticated_wolves.wolf_type.black"),
    BROWN("sophisticated_wolves.wolf_type.brown");

    private final String speciesStr;

    EnumWolfSpecies(String speciesStr) {
        this.speciesStr = speciesStr;
    }

    public static EnumWolfSpecies getSpeciesByNum(int num) {
        if (num >= 0 && num < EnumWolfSpecies.values().length) {
            return EnumWolfSpecies.values()[num];
        } else {
            return VANILLA;
        }
    }

    public String getSpeciesStr() {
        return this.speciesStr;
    }

}
