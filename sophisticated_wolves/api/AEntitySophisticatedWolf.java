package sophisticated_wolves.api;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.wolf.Wolf;
import net.minecraft.world.level.Level;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public abstract class AEntitySophisticatedWolf extends Wolf {

    public AEntitySophisticatedWolf(EntityType<? extends Wolf> entityType, Level level) {
        super(entityType, level);
    }

}
