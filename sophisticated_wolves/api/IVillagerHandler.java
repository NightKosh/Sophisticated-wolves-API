package sophisticated_wolves.api;

import net.minecraftforge.fml.common.registry.VillagerRegistry;

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
     * @return unlocalized name of the Pet seller villager
     */
    public String getPetsSellerName();
}
