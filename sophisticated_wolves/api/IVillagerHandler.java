package sophisticated_wolves.api;

import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IVillagerHandler {

    public static final String PETS_SELLER_ID = ModInfo.ID.toLowerCase() + ":pets_seller";

    @Nullable
    public VillagerRegistry.VillagerProfession getPetSellerProfession();

    @Nullable
    public VillagerRegistry.VillagerCareer getPetSellerCareer();

    /**
     * @return Localized name of the Pet seller villager
     */
    @SideOnly(Side.CLIENT)
    public String getPetsSellerName();
}
