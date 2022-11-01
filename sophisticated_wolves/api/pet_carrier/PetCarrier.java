package sophisticated_wolves.api.pet_carrier;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public abstract class PetCarrier {

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
    public CompoundTag getInfo(LivingEntity pet) {
        return null;
    }

    public CompoundTag getAdditionalData(LivingEntity pet) {
        return null;
    }

    /**
     * Restore additional information about pet, at its spawn
     * which can't be restored by readAdditionalSaveData method
     */
    public void setAdditionalData(Entity pet, CompoundTag tag) {

    }

    /**
     * Return list of pet carriers for creative tab
     */
    public abstract List<CompoundTag> getDefaultPetCarriers();

    /**
     * Create NBT tag for "default" pet carrier
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
