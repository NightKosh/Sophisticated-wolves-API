package sophisticated_wolves.api;

import net.minecraft.util.text.translation.I18n;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public enum EnumWolfSpecies {
    VANILLA("wolf_type.vanilla"),
    FOREST("wolf_type.forest"),
    BLACK("wolf_type.black"),
    BROWN("wolf_type.brown");

    private String speciesStr;

    private EnumWolfSpecies(String speciesStr) {
        this.speciesStr = speciesStr;
    }

    public static EnumWolfSpecies getSpeciesByNum(int num) {
        if (num >= 0 && num < EnumWolfSpecies.values().length) {
            return EnumWolfSpecies.values()[num];
        } else {
            return VANILLA;
        }
    }

    public static String getSpeciesName(EnumWolfSpecies species) {
        return I18n.translateToLocal(species.speciesStr);
    }
}
