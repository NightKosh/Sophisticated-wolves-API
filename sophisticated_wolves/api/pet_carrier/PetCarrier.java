package sophisticated_wolves.api.pet_carrier;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.List;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public abstract class PetCarrier {

    public abstract Class getPetClass();

    public abstract String getPetId();

    /**
     * This method should only spawn pet
     * All additional pet information will be restored separately
     * By copying pet NBT or in setAdditionalData method
     */
    public abstract EntityLiving spawnPet(World world, EntityPlayer player);

    /**
     * Provide information for pet carrier tooltips
     */
    public List<String> getInfo(NBTTagCompound infoNbt) {
        return null;
    }

    /**
     * Store pet's data in NBT for usage in tooltips
     */
    public NBTTagCompound getInfo(EntityLivingBase pet) {
        return null;
    }

    public NBTTagCompound getAdditionalData(EntityLivingBase pet) {
        return null;
    }

    /**
     * Restore additional information about pet, at its spawn
     * which can't be restored by readEntityFromNBT method
     */
    public void setAdditionalData(EntityLiving pet, NBTTagCompound nbt) {

    }

    /**
     * Return list of pet carriers for creative tab
     */
    public abstract List<NBTTagCompound> getDefaultPetCarriers();

    /**
     * Create NBT tag for "default" pet carrier
     * use it in getDefaultPetCarriers method
     */
    public final NBTTagCompound getDefaultPetCarrier(NBTTagCompound infoNbt, NBTTagCompound entityNbt) {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setString("ClassName", getPetClass().getSimpleName());

        if (infoNbt != null) {
            nbt.setTag("InfoList", infoNbt);
        }

        if (entityNbt != null) {
            nbt.setTag("MobData", entityNbt);
        }

        return nbt;
    }
}
