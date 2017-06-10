package sophisticated_wolves.api;

import sophisticated_wolves.api.pet_carrier.IPetCarrierHandler;

import javax.annotation.Nullable;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class SophisticatedWolvesAPI {

    @Nullable
    public static IEntityHandler entityHandler;

    @Nullable
    public static IPetCarrierHandler petCarrierHandler;
}
