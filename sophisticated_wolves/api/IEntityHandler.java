package sophisticated_wolves.api;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.level.Level;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IEntityHandler {
    //TODO does not works at the moment
    AEntitySophisticatedWolf getNewSophisticatedWolf(EntityType<? extends Wolf> entityType, Level level);

}
