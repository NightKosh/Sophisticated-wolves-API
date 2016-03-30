package sophisticated_wolves.api;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.World;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public abstract class AEntitySophisticatedWolf extends EntityWolf implements ISophisticatedWolf {
    public AEntitySophisticatedWolf(World world) {
        super(world);
    }
}
