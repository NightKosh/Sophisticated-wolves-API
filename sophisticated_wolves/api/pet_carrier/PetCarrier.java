package sophisticated_wolves.api.pet_carrier;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public abstract class PetCarrier<T extends Entity> {

    public abstract Class getPetClass();

    public abstract String getPetNameLocalizationKey();

    /**
     * Provide animal EntityType
     */
    public abstract @Nonnull EntityType getEntityType();

    /**
     * Provide information for pet carrier tooltips
     */
    public List<Component> getInfo(CompoundTag infoTag) {
        return null;
    }

    /**
     * Store pet's data in NBT for usage in tooltips
     */
    public CompoundTag getInfo(T pet) {
        return null;
    }

    public CompoundTag getAdditionalData(T pet) {
        return null;
    }

    /**
     * Restore additional information about pet, at its spawn
     * which can't be restored by readAdditionalSaveData method
     */
    public void setAdditionalData(T pet, CompoundTag tag) {

    }

    /**
     * Do some logic at pet spawn.
     * Used to do any mob specific logic
     * and to restore data, which can't be restored by mob's compound tag.
     * <p>
     * Additionally used to set/change pet owner.
     */
    public void doAtSpawn(T pet, Player player) {

    }

    /**
     * Return list of pet carriers for creative tab
     */
    public List<CompoundTag> getDefaultPetCarriers() {
        return List.of(getDefaultPetCarrier(null, null));
    }

    /**
     * Create CompoundTag tag for "default" pet carrier
     * use it in getDefaultPetCarriers method
     */
    public final CompoundTag getDefaultPetCarrier(CompoundTag infoTag, CompoundTag entityTag) {
        var tag = new CompoundTag();
        tag.putString("ClassName", getPetClass().getSimpleName());

        if (infoTag != null) {
            tag.put("InfoList", infoTag);
        }

        if (entityTag != null) {
            tag.put("MobData", entityTag);
        }

        return tag;
    }

}
