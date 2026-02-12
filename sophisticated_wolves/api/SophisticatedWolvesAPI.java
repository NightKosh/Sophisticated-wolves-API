package sophisticated_wolves.api;

import net.minecraft.world.entity.EntityType;

import javax.annotation.Nullable;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class SophisticatedWolvesAPI {

    public static final String VILLAGER_ID = "zoologist";

    public static final String SOPHISTICATED_WOLF_ID = "sophisticated_wolf";

    @Nullable
    public static EntityType<? extends AEntitySophisticatedWolf> SOPHISTICATED_WOLF_TYPE;

}
